let i = 0

// Grab all the layers and read them into an array so we can iterate them.
let layers = Array.from(document.querySelectorAll('img.layer'))
const nextLayer = () => {
    // increment i and compare incremented value, if greater than 3, reset to first layer.
    if(++i > 3)
        i = 1
    // iterate all layers and set their CSS display property to none.
    layers.forEach((x) => { x.style.display = 'none' })
    // select the single layer we are currently on and set its css display to block.
    document.querySelector(`img.layer_${i}`).style.display = 'block'
}

// show first layer
nextLayer()
// show next layer every 2 seconds
setInterval(nextLayer, 2000)