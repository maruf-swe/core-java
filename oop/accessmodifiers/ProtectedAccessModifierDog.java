package javaoop.accessmodifiers;
class ProtectedAccessModifierDog extends ProtectedAccessModifierAnimal{

    public ProtectedAccessModifierDog(String name){
        super(name);
    }

    // child class method
    public void bark(){
        System.out.println(name + " Bark Loudly");
    }

    public void showInfo(){
        speak();
    }


}
