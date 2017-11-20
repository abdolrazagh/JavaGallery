package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Picture;
import model.PictureManager;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet to handle File upload request from Client
 * @author Javin Paul
 */
public class FileUploadHandler extends HttpServlet {
    private final String UPLOAD_DIRECTORY = "C:\\Users\\mabdo\\IdeaProjects\\JavaGallery\\web\\assets\\img";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //process only if its multipart content
        if(ServletFileUpload.isMultipartContent(request)){
            try {
                List<FileItem> multiparts = new ServletFileUpload(
                        new DiskFileItemFactory()).parseRequest(request);
                String name = "";
                String value = "";
                for(FileItem item : multiparts){
                    if(!item.isFormField()){
                         name = new File(item.getName()).getName();
                        item.write( new File(UPLOAD_DIRECTORY + File.separator + name));
//                        System.out.println(UPLOAD_DIRECTORY + File.separator + name);

                    }else {
                        //name = item.getFieldName();
                        value = item.getString();

                    }
                }
                int cat_Id = Integer.parseInt(value);
                Picture picture = new Picture(cat_Id, name, 1);
                PictureManager.savePicture(picture);

                //File uploaded successfully
                request.setAttribute("message", "Picture Uploaded Successfully");
            } catch (Exception ex) {
                request.setAttribute("message", "Picture Upload Failed due to " + ex);
            }

        }else{
            request.setAttribute("message",
                    "Sorry this Servlet only handles file upload request");
        }

        request.getRequestDispatcher("/admin.jsp").forward(request, response);

    }

}
