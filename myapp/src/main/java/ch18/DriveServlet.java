package ch18;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet("/ch18/DriveServlet")
public class DriveServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
   private String uploadPath;
         
   public void init() throws ServletException {
      // 업로드 폴더 지정
      super.init();
      uploadPath = getServletContext().getRealPath("WEB-INF/upload");
      System.out.println(uploadPath);
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      String[] fileList = new File(uploadPath).list();
      request.setAttribute("fileList", fileList);
      
      RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/drive.jsp");
      dispatcher.forward(request, response);
      
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      Part filePart = request.getPart("file");
//      String fileName = filePart.getSubmittedFileName();
//      filePart.write(new File(uploadPath, fileName).getPath());
      ServletInputStream in = request.getInputStream();
      FileOutputStream out = new FileOutputStream(new File(uploadPath, "multipart.txt"));
      write(in, out);
      in.close();
      out.close();
      response.sendRedirect("./DriveServlet");
   }

   private void write(InputStream in, OutputStream out) throws IOException {
      byte[] buffer = new byte[512];
      int length;
      while((length = in.read(buffer)) >= 0) {
         out.write(buffer, 0, length);
      }
   }
}