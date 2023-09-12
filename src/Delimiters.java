import java.util.ArrayList;
public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public String getOpenDel() {return openDel;}
    public String getCloseDel() {return closeDel;}

    public ArrayList<String> getDelimitersList(String[] token) {
        ArrayList<String> delims = new ArrayList<>();
        for (String x : token) {
            if (x == openDel || x == closeDel) {
                delims.add(x);
            }
        }
        return delims;

    }
    public boolean isBalanced(ArrayList delimiters) {
        int openCnt = 0, closeCnt = 0;
        for (Object o : delimiters) {
            String s = o.toString();
            if (s.equals(openDel)) openCnt++;
            if (s.equals(closeDel)) closeCnt++;
            if (closeCnt > openCnt) {
                return false;
            }
        }
        if (openCnt != closeCnt) {
            return false;
        }
        return true;
    }
}
