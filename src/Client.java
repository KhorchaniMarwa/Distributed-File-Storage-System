import java.util.ArrayList;
import java.util.Date;

public class Client {
    private  String email;
    private String password;
    private ArrayList<Files> UserFiles = new ArrayList<Files>();
    public Client(String email,String password, ArrayList<Files> UserFiles){
          this.email = email;
          this.password = password;
          this.UserFiles = UserFiles;
      }
      //getters
    //email getter
    public String getEmail(){
          return email;
    }
    //password getter
    public String getPassword(){
          return password;
    }
    public Files getFile(ArrayList<Files> UserFiles, int index){

          try {
              return UserFiles.get(index);
          } catch (Exception e) {
              throw new RuntimeException(e);
          }
    }
    //setters


      public String Upload(Files fileToUpload){
          try {
              UserFiles.add(fileToUpload);
              return ("file uploaded successfully");

          } catch (Exception e) {
              throw new RuntimeException(e);
             // return ("error uploading file");
          }
      }

     /* public Files download(){

      }
      */

}
