//save value, printAll ,update value
class EntertainmentOperation{
	Entertainment dtos[]=new Entertainment[5];
	boolean save(int index,Entertainment dto){
		if(index<dtos.length){
			dtos[index]=dto;
			return true;
		}
		else{
			System.out.println("plz enter valid index");
			return false;
		}
	}
	void printAll(){
		for(int index=0;index<dtos.length;index++){
			if(dtos[index]!=null){
				System.out.println(dtos[index].type+"\t"+dtos[index].duration+"\t"+dtos[index].interest+"\t"+dtos[index].didYouLike);
			}
		}
	}
	String update(boolean dyl,String type){
		String msg=null;
		for(int index=0;index<dtos.length;index++){
			if(dtos[index]!=null){
			if(type.equals(dtos[index].type)){
				dtos[index].didYouLike=dyl;

			}
			}
		}
		msg="data updated";
		return msg;
	}
}