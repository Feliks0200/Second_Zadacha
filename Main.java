void main() throws InterruptedException {
    imageFile imageFile = new imageFile(500);
    VideoFile videoFile = new VideoFile(5000);
    DocumentFile documentFile = new DocumentFile(10);
    imageFile imageFile1 = new imageFile(5001);
    VideoFile videoFile1 = new VideoFile(50010);
    DocumentFile documentFile1 = new DocumentFile(101);
    imageFile imageFile2 = new imageFile(5020);
    VideoFile videoFile2 = new VideoFile(50020);
    DocumentFile documentFile2 = new DocumentFile(102);
    LinkedList<Downloadable> aboba = new LinkedList<>();
    List<Downloadable> down = new ArrayList<>();
    aboba.add(imageFile);
    aboba.add(videoFile);
    aboba.add(documentFile);
    aboba.add(imageFile1);
    aboba.add(videoFile1);
    aboba.add(documentFile1);
    aboba.add(imageFile2);
    aboba.add(videoFile2);
    aboba.add(documentFile2);


    Thread th1= new Thread((Runnable) new DownloadManager(aboba,down));
    Thread th2= new Thread((Runnable) new DownloadManager(aboba,down));
    Thread th3= new Thread((Runnable) new DownloadManager(aboba,down));


    th1.start();
    th2.start();
    th3.start();

    th1.join(555);
    th2.join(555);
    th3.join(555);

    System.out.println();
    System.out.println("Скачанны файлы :");
    for(int i=0;i<=down.size()-1;i++){
        System.out.println(down.get(i).printt());
    }
}
