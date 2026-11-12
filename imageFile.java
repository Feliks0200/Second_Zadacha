public class imageFile implements Downloadable{
    int size;
    public imageFile(int size) {
        this.size = size;
    }

    public String getme(){
        return "Image";
    }

    @Override
    public String printt(){
        return "imageFile{" + "size=" + size + '}';
    }

    @Override
    public void download(){
        System.out.println("Скачиваю :Фото");
    }
}
