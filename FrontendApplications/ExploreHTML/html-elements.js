function showHideFullStackConcepts(){
    alert("Show / Hide FullStack Concepts");

    var con = document.getElementById("fsconcepts");
    if(con.style.display === "none"){
        alert('if ...');
        con.style.display = "block";
    }
    else{
        alert(' else...');
        con.style.display = "none";
    }
}

function showInstituteName(){
    alert('Ignite Tech Academy');
}