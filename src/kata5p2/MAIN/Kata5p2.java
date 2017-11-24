package kata5p2.MAIN;

import java.io.IOException;
import java.util.List;
import kata5p2.model.Histogram;
import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailHistogramBuilder;
import kata5p2.view.MailListReader;

public class Kata5p2 {
    
    private List<String> mailList;
    private Histogram<String> histogram;
    
    public static void main(String[] args) throws IOException {     
        Kata5p2 kata = new Kata5p2();
        kata.execute(); 
    }
    
    private void execute() throws IOException{
        input();
        process();
        output();
    }
    
    private void input() throws IOException{
        String filename = "C:\\Users\\Experimentos\\Documents\\NetBeansProjects\\Kata4\\emailsfile.txt";
        mailList = MailListReader.read(filename);
    }
    
    private void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    private void output(){
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }    
}

