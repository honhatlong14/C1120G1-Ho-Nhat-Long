package lession_5_AccessModifier_staticmethod_staticproperty.Thuc_hanh.Access_Modifier;

public class Access_Modifier {
    public static class A{

        private int data=40;

        private void msg(){System.out.println("Hello java");}

    }

    public static class Simple{

        public static void main(String args[]){


            A obj= new A();

            System.out.println(obj.data);//Compile Time Error

            obj.msg();//Compile Time Error

        }

    }
}
