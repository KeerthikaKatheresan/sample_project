abstract class Sports
{
    abstract void play();
}

 class Football extends Sports{
    @Override
     void play()
    {
        System.out.println("Hii from football");
    }
}

 class Basketball extends Sports{
    @Override
     void play()
    {
        System.out.println("Hii from Basketball");
    }
}

class Rugby extends Sports{
    @Override
     void play()
    {
        System.out.println("Hii from Rugby");
    }
}

public class q2{
    public static void main(String[] args)
    {
        Sports f1=new Football();
        Sports b1=new Basketball();
        Sports r1=new Rugby();

        f1.play();
        b1.play();
       r1.play();
    }
}