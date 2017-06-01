/*Ejercicio 3*/
        
        System.out.println("Cuantos valores desea ingresar: ");
        int [] vector4;
        int vector4Tam = in.nextInt();
        vector4 = new int [vector4Tam];
        for(int index1 = 0; index1 < vector4Tam; index1++){
            System.out.println("Ingrese valor: ");
            vector4[index1] = in.nextInt();
        }
        boolean posiNiggi;
        posiNiggi = GuiaDeEjercicios1.positivos(vector4);
        if(posiNiggi == true){
            System.out.println("Todos Positivos");
        } else
        {
            System.out.println("No todos positivos");
        }