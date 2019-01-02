function getAll(...name:String[]){
	let listN:String="";
	for (let n of name){
		listN=listN+" "+n;
		console.log("name added is "+n);
	}
	console.log("list of names is "+listN);
}

getAll("hari","harish","suresh","naresh","girish");