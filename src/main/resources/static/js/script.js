// --------- Day Label ----------

// ------ Daily Meeting Selector --------
<<<<<<< HEAD
jQuery(document).ready(function($) {
    alert("Your location is: " + geoplugin_countryName() + ", " + geoplugin_region() + ", " + geoplugin_city());
});
<<<<<<< HEAD
=======

>>>>>>> 6c341261493ab1170177b13158cafe39d9eb3aff

// $('.meeting').hide();
// $('#su').click(function(){
//   $('#sunday').show();
// });



document.getElementById("su").onclick = function() {
  document.querySelector('#su').style.color = "#276AAD";
  document.querySelector('#m').style.color = "black";
  document.querySelector('#tu').style.color = "black";
  document.querySelector('#w').style.color = "black";
  document.querySelector('#th').style.color = "black";
  document.querySelector('#f').style.color = "black";
  document.querySelector('#sa').style.color = "black";
  $('#sunday').show();
<<<<<<< HEAD
>>>>>>> 5559ca25a8be99743127c5fc130fd3e8950a9011
=======
>>>>>>> 6c341261493ab1170177b13158cafe39d9eb3aff
    $('#monday').hide();
    $('#tuesday').hide();
    $('#wednesday').hide();
    $('#thursday').hide();
    $('#friday').hide();
    $('#saturday').hide();
    $('#top-five').hide();
};
document.getElementById("m").onclick = function() {
  document.querySelector('#m').style.color = "#276AAD";
  document.querySelector('#su').style.color = "black";
  document.querySelector('#tu').style.color = "black";
  document.querySelector('#w').style.color = "black";
  document.querySelector('#th').style.color = "black";
  document.querySelector('#f').style.color = "black";
  document.querySelector('#sa').style.color = "black";
  $('#monday').show();
    $('#sunday').hide();
    $('#tuesday').hide();
    $('#wednesday').hide();
    $('#thursday').hide();
    $('#friday').hide();
    $('#saturday').hide();
    $('#top-five').hide();
};

document.getElementById("tu").onclick = function() {
  document.querySelector('#tu').style.color = "#276AAD";
  document.querySelector('#su').style.color = "black";
  document.querySelector('#m').style.color = "black";
  document.querySelector('#w').style.color = "black";
  document.querySelector('#th').style.color = "black";
  document.querySelector('#f').style.color = "black";
  document.querySelector('#sa').style.color = "black";
  $('#tuesday').show();
    $('#sunday').hide();
    $('#monday').hide();
    $('#wednesday').hide();
    $('#thursday').hide();
    $('#friday').hide();
    $('#saturday').hide();
    $('#top-five').hide();
};

document.getElementById("w").onclick = function() {
  document.querySelector('#w').style.color = "#276AAD";
  document.querySelector('#su').style.color = "black";
  document.querySelector('#tu').style.color = "black";
  document.querySelector('#m').style.color = "black";
  document.querySelector('#th').style.color = "black";
  document.querySelector('#f').style.color = "black";
  document.querySelector('#sa').style.color = "black";
  $('#wednesday').show();
    $('#sunday').hide();
    $('#monday').hide();
    $('#tuesday').hide();
    $('#thursday').hide();
    $('#friday').hide();
    $('#saturday').hide();
    $('#top-five').hide();
};

document.getElementById("th").onclick = function() {
  document.querySelector('#th').style.color = "#276AAD";
  document.querySelector('#su').style.color = "black";
  document.querySelector('#tu').style.color = "black";
  document.querySelector('#w').style.color = "black";
  document.querySelector('#m').style.color = "black";
  document.querySelector('#f').style.color = "black";
  document.querySelector('#sa').style.color = "black";
  $('#thursday').show();
    $('#sunday').hide();
    $('#monday').hide();
    $('#tuesday').hide();
    $('#wednesday').hide();
    $('#friday').hide();
    $('#saturday').hide();
    $('#top-five').hide();
};

document.getElementById("f").onclick = function() {
  document.querySelector('#f').style.color = "#276AAD";
  document.querySelector('#su').style.color = "black";
  document.querySelector('#tu').style.color = "black";
  document.querySelector('#w').style.color = "black";
  document.querySelector('#th').style.color = "black";
  document.querySelector('#m').style.color = "black";
  document.querySelector('#sa').style.color = "black";
  $('#friday').show();
    $('#sunday').hide();
    $('#monday').hide();
    $('#tuesday').hide();
    $('#wednesday').hide();
    $('#thursday').hide();
    $('#saturday').hide();
    $('#top-five').hide();
};

document.getElementById("sa").onclick = function() {
  document.querySelector('#sa').style.color = "#276AAD";
  document.querySelector('#su').style.color = "black";
  document.querySelector('#tu').style.color = "black";
  document.querySelector('#w').style.color = "black";
  document.querySelector('#th').style.color = "black";
  document.querySelector('#f').style.color = "black";
  document.querySelector('#m').style.color = "black";
  $('#saturday').show();
    $('#sunday').hide();
    $('#monday').hide();
    $('#tuesday').hide();
    $('#wednesday').hide();
    $('#thursday').hide();
    $('#friday').hide();
    $('#top-five').hide();
};

// -------- Quick Find Button --------

document.getElementById("quick-btn").onclick = function() {
  document.querySelector('#quick-btn').style.visibility = "hidden";
  document.querySelector('#selector').style.visibility = "hidden";
  document.querySelector('#quick-btn').style.display = "none";
  document.querySelector('#selector').style.display = "none";
  document.querySelector('#back').style.visibility = "visible";
  document.querySelector('#quick-info').style.visibility = "visible";
  $('#top-five').show();
    $('#sunday').hide();
    $('#monday').hide();
    $('#tuesday').hide();
    $('#wednesday').hide();
    $('#thursday').hide();
    $('#friday').hide();
    $('#saturday').hide();

};

  document.getElementById("back").onclick = function() {

  document.querySelector('#quick-btn').style.visibility = "visible";
  document.querySelector('#selector').style.visibility = "visible";

  document.querySelector('#quick-btn').style.display = "flex";
  document.querySelector('#selector').style.display = "flex";
  document.querySelector('#back').style.visibility = "hidden";
  document.querySelector('#quick-info').style.visibility = "hidden";
  $('#sunday').show();
  $('#monday').show();
  $('#tuesday').show();
  $('#wednesday').show();
  $('#thursday').show();
  $('#friday').show();
  $('#saturday').show();
  $('#top-five').show();
};


// ------- Favorite Button ---------
// document.getElementById("fav-btn").onclick = function() {
//   document.querySelector('#fav-btn').style.background = "#EA5858";
// };
