package teste;


class PrintValue implements Runnable {
	
	  private String valor = "";
	  private int contador = 0;
	  private String name;
	  private Single single = Single.getInstance();
	  
	  public PrintValue(String threadName) {
		    this.name = threadName;
		  }
	  
	  public void run() {
	    while (true) {
	      // Espera por 1 segundo
	      try {
	        Thread.sleep(100);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }

	      // Imprime o valor da variável compartilhada pelas threads
	      String variable = SharedVariable.getValue();
	      if(!this.valor.equals(variable)) {
	    	  
	    	  if(this.single.solicitarInsercao(contador)) {
	    		  
	    		  System.out.println( this.name + " Leu:   " + variable);
	    	  }
	    	  else {
	    		  System.out.println( this.name + " Foi mais lenta "); 
	    	  }
	    	  
	    	  this.contador += 1;
	    	  
	    	  this.valor = variable;
	      }
	    }
	  }
	}