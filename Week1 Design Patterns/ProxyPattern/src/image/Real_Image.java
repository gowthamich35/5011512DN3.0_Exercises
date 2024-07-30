package image;

//RealImage.java
public class Real_Image implements Image {
 private String filename;

 public Real_Image(String filename) {
     this.filename = filename;
     loadImageFromServer();
 }

 private void loadImageFromServer() {
     System.out.println("Loading image: " + filename);
 }

 @Override
 public void display() {
     System.out.println("Displaying image: " + filename);
 }
}
