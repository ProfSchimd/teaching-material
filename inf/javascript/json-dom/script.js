function domAccessExamples() {
    // element (not necessarily a div) with id content
    const contentElement = document.querySelector('#content');
    console.log(contentElement); 
    // >> <div id="content">

    // get the first h2 having the class subtitle
    const subtitleH2 = document.querySelector('h2.subtitle');
    console.log(subtitleH2);
    // >> <h2 class="subtitle">

    // get all elements of type div
    const allDiv = document.querySelectorAll('div');
    console.log(allDiv);
    // >> NodeList(3) [ div#header, ... ]
}

function eventListenerExample() {
    const clickMe = document.querySelector('#clickme');
    clickMe.addEventListener('click', () => console.log('clicked!!'));
}

function addClicked(e) {
    console.log('click!');
    console.log(e);
}

function createItemDiv() {
    return document.createElement('div');
}

function available(stock) {
    const element = document.createElement('p');
    if (stock < 5) {
        element.append('Solo ');
        element.classList.add('warning');
    }
    element.append(stock + ' disponibili');
    return element;
}

function showProducts(json) {
    console.log(json.products);
    const contentDiv = document.querySelector('#content');
    for (let item of json.products)
    {
        const newDiv = document.createElement('div');
        newDiv.classList.add('with-border');
        const h4Element = document.createElement('h4');
        h4Element.append(item.name);
        const descriptionParagraph = document.createElement('p');
        descriptionParagraph.append(item.description);
        const priceParagraph = document.createElement('p');
        priceParagraph.append(item.price + ' €');
        const stockElement = available(item.stock);
        const addToCart = document.createElement('input')
        addToCart.type = 'button';
        addToCart.value = 'Add to Cart';
        addToCart.addEventListener(
            'click',
            () => alert(`${item.name} added to cart`)
        )
        newDiv.append(h4Element, descriptionParagraph, priceParagraph, stockElement, addToCart);
        contentDiv.append(newDiv);
    }
}

function main() {
    domAccessExamples();
    eventListenerExample();
    console.log(createItemDiv());
    
    const jsonUrl = 'https://raw.githubusercontent.com/ProfSchimd/teaching-material/main/inf/javascript/json-dom/data.json';
    fetch(jsonUrl)
        .then(res => res.json())
        .then(json => showProducts(json))
        .catch(err => console.log(err));
    
}