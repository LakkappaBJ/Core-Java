class Mobiles{
	static String []models={"Mi","Lenevo","Iphone","Samsung","Nokia"};
		static void mobileModels(){
			for(int num=0;num<models.length;num++){
				System.out.print(models[num]+"\t");
			}
		
		}

		public static void main(String args[]){
			mobileModels();
			System.out.println();
			models[1]="Oppo";
			mobileModels();
			}
}