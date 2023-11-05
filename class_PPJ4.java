class PPJ4{
    public static void main(String[] args){
        {
            int a =  1_500_000_000;
            System.out.println(a + a);
        }
        
        {
            long a =  1_500_000_000;
            System.out.println(a + a);
        }
        
        {
            System.out.println(1_500_000_000 + 1_500_000_000);
        }
        
        {
            System.out.println(1_500_000_000L + 1_500_000_000L);
        }
    }
}