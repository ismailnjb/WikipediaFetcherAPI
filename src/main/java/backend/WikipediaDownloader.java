package backend;

public class WikipediaDownloader implements Runnable {

    public WikipediaDownloader(){

    }
    public WikipediaDownloader(String keyword) {
        this.keyword = keyword;
    }

    private String keyword;

    public void run() {

    }

    public static void main(String[] args) {
        TaskManager taskManager=new TaskManager(20);
        WikipediaDownloader wikipediaDownloader=new WikipediaDownloader(("Albert_Einstein"));
        taskManager.waitTillQueueIsFreeAndAddTask(wikipediaDownloader);

    }
}
