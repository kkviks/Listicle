package com.example.trackandtrigger;

/* For toDoFragment */

public class Collect {
    private String title;
    private int image_id;
    public static String URL = "https://i.ibb.co/cLkzFTJ/ic-flipkart.png";

    public Collect() {
        //empty constructor needed
    }

    public Collect(String title, int image_id) {
        this.title = title;
        this.image_id = image_id;
    }

    /*
https://i.ibb.co/Kjxf9hh/unnamed-9.png
https://i.ibb.co/9WYCPTJ/unnamed-8.png
https://i.ibb.co/Gnmfr5J/unnamed-7.png
https://i.ibb.co/s6qm2Lb/unnamed-6.png
https://i.ibb.co/1zm2N0X/unnamed-5.png
https://i.ibb.co/6BXf0JH/unnamed-4.png
https://i.ibb.co/BgVpd6w/unnamed-3.png
https://i.ibb.co/2n3xNcR/unnamed-2.png*/

    public static String findURL(int image_id) {
        String url="";
        switch (image_id){
            //case 1: url="https://i.ibb.co/cLkzFTJ/ic-flipkart.png"; break;
            case 1: url="https://i.ibb.co/9WYCPTJ/unnamed-8.png"; break;
            case 2: url="https://i.ibb.co/1zm2N0X/unnamed-5.png"; break;
            case 3: url="https://i.ibb.co/6BXf0JH/unnamed-4.png"; break;
            case 4: url="https://i.ibb.co/BgVpd6w/unnamed-3.png"; break;
            case 5: url="https://i.ibb.co/2n3xNcR/unnamed-2.png"; break;
            case 6: url="https://i.ibb.co/Kjxf9hh/unnamed-9.png"; break;
            case 7: url="https://i.ibb.co/zxW3Rdy/unnamed-7.png"; break;
            case 8: url="https://i.ibb.co/ZmPx95G/unnamed-8.png"; break;
            case 9: url="https://i.ibb.co/s6qm2Lb/unnamed-6.png"; break;
           // case 11: url="https://i.ibb.co/5x4LFVs/Axis-Bank-PNG-Logo-1024x1024.png"; break;
            default: url="https://i.ibb.co/B3469zs/no-image-found-360x260.png";
        }
        return url;
    }


    public String getTitle() {
        return title;
    }

    public int getImage_id() {
        return image_id;
    }
}