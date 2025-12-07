window.addEventListener('load', () => {

    // first we need to create a stage
    const stage = new Konva.Stage({
        container: 'container', // id of container <div>
        width: 800,
        height: 800,
    });

    // then create layer
    const layer = new Konva.Layer();

    // create our shape
    const circle = new Konva.Circle({
        x: stage.width() / 2,
        y: stage.height() / 2,
        radius: 70,
        fill: 'red',
        stroke: 'black',
        strokeWidth: 4,
        shadowBlur: 40,
        opacity: 0.5,
    });
    circle.draggable(true);

    const text = new Konva.Text({
        x: 40,
        y: 40,
        text: 'Draggable Text',
        fontSize: 20,
        draggable: true,
        width: 200,
    });
    // add the shape to the layer
    layer.add(circle);
    circle.on('dragmove', () => {
        text.text(`(${circle.x()},${circle.y()})`);
    })
    layer.add(text);

    // add the layer to the stage
    stage.add(layer);
});