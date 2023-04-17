// Get the element with id="myDIV" (a div), then get all p elements inside div
var x = document.getElementById("container").querySelectorAll("button");



function hoverin(){

      
    x[i].style.boxShadow="1px 1px 2px black, 0 0 25px white, 0 0 5px white";
    x[i].style.borderColor="white";
    
}
function hoverout(){
    
        x[i].style.boxShadow="none";
    x[i].style.color="black";
    x[i].style.borderStyle="none";
    
}

// Create a for loop and set the background color of all p elements in div
let i;
for (i = 0; i < x.length; i++) {
 
if(MouseEvent="onmouseover"){
    x[i].onmouseover=function(){hoverin ()};
    x[i].onmouseout=function(){hoverout()};
    
}




}