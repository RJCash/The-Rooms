// ------ Daily Meeting Selector --------
document.getElementById("su").onclick = function() {
  $('#sunday').show();
    $('#monday').hide();
    $('#tuesday').hide();
    $('#wednesday').hide();
    $('#thursday').hide();
    $('#friday').hide();
    $('#saturday').hide();
    $('#top-five').hide();
};


document.getElementById("m").onclick = function() {
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
<<<<<<< HEAD
  document.querySelector('#quick-btn').style.visibility = "hidden";
  document.querySelector('#selector').style.visibility = "hidden";
=======
  document.querySelector('#quick-btn').style.display = "none";
  document.querySelector('#selector').style.display = "none";
>>>>>>> 4fb59f98af3d805c28b1acbe1340c6f7f7d711cc
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
<<<<<<< HEAD
  document.querySelector('#quick-btn').style.visibility = "visible";
  document.querySelector('#selector').style.visibility = "visible";
=======
  document.querySelector('#quick-btn').style.display = "flex";
  document.querySelector('#selector').style.display = "flex";
>>>>>>> 4fb59f98af3d805c28b1acbe1340c6f7f7d711cc
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
