"use strict";
exports.__esModule = true;
var shape = /** @class */ (function () {
    function shape() {
        this.name1 = "akshay";
        this.area1 = "hyderabad";
        console.log(" i am empty" + this.name1 + " " + this.area1);
    }
    shape.prototype.noOfSide = function (name) {
        console.log("no of sides greater than 3 ");
        return 3;
    };
    return shape;
}());
exports.shape = shape;
