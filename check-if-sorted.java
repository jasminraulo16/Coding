class HelloWorld {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int i;
        for(i=0;i<5;i++)
        {
            System.out.println(""+a[i]+"" );
        }
        for(i=0;i<5;i++)
        {
            if(a[i]<=a[i+1])
            {
                System.out.println("sorted");
            }
            else
            {
                System.out.println("notsorted"); 
            }
        }
    }
}