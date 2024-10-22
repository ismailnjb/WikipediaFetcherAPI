package backend;

public class WikipediaDownloader implements Runnable {

    public WikipediaDownloader(){

    }
    public WikipediaDownloader(String keyword) {
        this.keyword = keyword;
    }

    private String keyword;

    public void run() {
        if(this.keyword==null || this.keyword.length()==0){
            return;
        }

        this.keyword=this.keyword.trim().replaceAll("[ ]+","_");

        String wikiUrl=getWikipediaUrlForQuery(this.keyword);


    }

    private String getWikipediaUrlForQuery(String cleanKeyword) {
        return "https://en.wikipedia.org/wiki/"+cleanKeyword;
    }

    public static void main(String[] args) {
        TaskManager taskManager=new TaskManager(20);
        WikipediaDownloader wikipediaDownloader=new WikipediaDownloader(("Albert_Einstein"));
        taskManager.waitTillQueueIsFreeAndAddTask(wikipediaDownloader);

    }
}
