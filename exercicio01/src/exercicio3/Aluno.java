package exercicio3;

public class Aluno {
   private String nome;
   String matricula;
   private float notaAV1, notaAV2, notaAE;
   private String curso;
   private int periodo;


   public Aluno(String nome, String matricula, float notaAV1, float notaAV2, String curso, int periodo) {
      this.nome = nome;
      this.matricula = matricula;
      this.notaAV1 = notaAV1;
      this.notaAV2 = notaAV2;
      this.curso = curso;
      this.periodo = periodo;
      private double somaNota;
   }

   public void alterarAV1(float nota) {

      this.notaAV1 = nota;
   }
   public void alterarAV2(float nota) {
      this.notaAV2 = nota;
      public void alterarAE ( float nota){
         this.notaAE = nota;

         public void avaliarAluno() {
            float somaNota = this.notaAV1 + this.notaAV2;
            if ( nota >= 60)
               System.out.println(" aprovado ");
         }
            else
         System.out.println(" recuperacao ");
      }
   }
   public void avaliarRecuperacao (int i){
      if (((somaNota+notaAE)/2)>=60)
         System.out.println( " reprovado");
   }

   public void avaliarAluno() {
   }
}
