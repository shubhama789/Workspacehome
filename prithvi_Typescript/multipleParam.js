function getAll() {
    var name = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        name[_i] = arguments[_i];
    }
    var listN = "";
    for (var _a = 0, name_1 = name; _a < name_1.length; _a++) {
        var n = name_1[_a];
        listN = listN + " " + n;
        console.log("name added is " + n);
    }
    console.log("list of names is " + listN);
}
getAll("hari", "harish", "suresh", "naresh", "girish");
