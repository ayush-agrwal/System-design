public class Client {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image is not loaded yet
        image1.display();  // Loading and displaying image1

        // Image is already loaded, just display
        image1.display();  // Displaying image1 without loading again

        // Image is not loaded yet
        image2.display();  // Loading and displaying image2
    }
}
