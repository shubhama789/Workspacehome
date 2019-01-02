interface Student{
id:number;
name:String;
courseName:String;
isStudent:boolean;
fail:null;
}

let stu:Student={
id:789,
courseName:"Java",
name:"addition",
isStudent:true,
fail:null
}

console.log(stu.id+' '+stu.name);