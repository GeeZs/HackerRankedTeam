package Challenges.javaVarargs;

 class Add {
     void add(int... args){
         int res = 0;
         for (int i = 0; i < args.length; i++) {
             res += args[i];
             System.out.print(args[i]);
             System.out.print(i == args.length-1 ? "=" : "+");
         }
         System.out.println(res);
     }
}
