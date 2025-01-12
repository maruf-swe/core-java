package javaoop.accessmodifiers;

class ProtectedAccessModifierAnimal {
    // Protected Variable
    protected String name;

    protected ProtectedAccessModifierAnimal(String name){
        this.name = name;
    }

    // Protected Method
    protected void speak(){
        System.out.println("The " + name + " Makes a Sound");
    }
}
