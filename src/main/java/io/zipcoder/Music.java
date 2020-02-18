package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int count = 0;
        int len = playList.length;
            for(int i = startIndex; i < playList.length; i++) {
                if (startIndex == 0 && playList[len - 1].equals(selection)) {
                    return 1;
                }
                else if(!playList[i].equals(selection)){
                    count++;
                }
                else if(playList[i].equals(selection)){
                    return count;
                }
            }
        return count;
    }
}
