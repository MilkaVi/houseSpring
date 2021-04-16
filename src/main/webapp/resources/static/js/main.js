"use strict";

var filterItem = document.querySelectorAll('.filter-item__header');

var _loop = function _loop(i) {
  filterItem[i].addEventListener('click', function () {
    filterItem[i].parentElement.classList.toggle('filter-item--active');
  });
};

for (var i = 0; i < filterItem.length; i++) {
  _loop(i);
}

var rangeSlider = document.getElementById('range-slider');

if (rangeSlider) {
  noUiSlider.create(rangeSlider, {
    start: [500, 90000],
    connect: true,
    step: 1,
    range: {
      'min': [500],
      'max': [99999]
    }
  });
  var input1 = document.getElementById('-1');
  var input2 = document.getElementById('-2');
  var inputs = [input1, input2];
  rangeSlider.noUiSlider.on('update', function (values, handle) {
    inputs[handle].value = Math.round(values[handle]);
  });

  var setRangeSlider = function setRangeSlider(i, value) {
    var arr = [null, null];
    arr[i] = value;
    rangeSlider.noUiSlider.set(arr);
  };

  inputs.forEach(function (el, index) {
    el.addEventListener('change', function (e) {
      setRangeSlider(index, e.currentTarget.value);
    });
  });
}
/*
$(document).ready(function() {
    var filterItem=function(){
        $(document).on('click','.filter-item__header',function(){
            $(this).parent().toggleClass('filter-item--active')
        })
    }

var filterSlider=function (){
    $(".filter-slider__line").each(function(){
        let slider=$(this)[0],
            sliderFrom=$(this).parent().find(".filter-slider__value--from")[0],
            sliderTo=$(this).parent().find(".filter-slider__value--to")[0],
            inputs=[sliderFrom,sliderTo],
            type=$(this).data('range-type');
    if(type==="price"){
        noUiSlider.create(slider,{
            start:[2500,5900],
            connect:true,
            range:{
                min:0,
                max:10000
            },
            format:wNumb({
                decimals:0,
                thousand: ' ',
            })
        })
    }

    slider.noUiSlider.on("update",function(values,handle){
        inputs[handle].value=values[handle];
    })
    })
}

    filterItem();
});*/