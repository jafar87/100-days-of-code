package Day_4.Example_Collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*ArrayList;-
    The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types.
    The ArrayList class maintains the insertion order and is non-synchronized.
    The elements stored in the ArrayList class can be randomly accessed.*/
    class Playlist{
        public static void main(String args[]){
            ArrayList<String> spotify=new ArrayList<String>();//Creating arraylist
            spotify.add("ARRahman Song");//Adding object in arraylist
            spotify.add("Gv Song");
            spotify.add("Anirudh Song");
            spotify.add("Yuvan Song");
            spotify.add(0,"ilayaraja song");
            System.out.println(spotify.get(0));
            System.out.println(spotify.indexOf("Yuvan Song"));

            ArrayList<String> youtubemusic=new ArrayList<String>();
            youtubemusic.add("munbe vaa");
            youtubemusic.add("vaa asuran");
            youtubemusic.add("vaathi coming");
            youtubemusic.add("oru naal iravil");
            youtubemusic.addAll(spotify);
            System.out.println(youtubemusic);
            System.out.println("checking-----");
            System.out.println(youtubemusic.contains("vaathi coming"));
            youtubemusic.clear();
            System.out.println(youtubemusic);
            spotify.clone();
            System.out.println(spotify);

            spotify.addAll(2,youtubemusic);
            System.out.println(spotify);


//Traversing list through Iterator
            ListIterator<String> itr=spotify.listIterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
            while(itr.hasPrevious()){
                System.out.println(itr.previous());
            }
            Iterator itrarraylist = spotify.iterator();
            while (itrarraylist.hasNext()){
                System.out.println(itrarraylist.next());
            }
        }
    }

