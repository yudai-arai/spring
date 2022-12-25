new Vue({
    el: '#app',
    data: {
        message: 'HelloWorld!',
        number: 0,
        ok: true,
        html: '<h1>h1です</h1>',
        url: 'https://google.com',
        attribute: 'href',
        twitterObject: {
            href: 'https://twitter.com',
            id: 31,
        },
        x: 0,
        y: 0
    },
    methods: {
        sayHi: function() {
            return this.message;
        },
        countUp: function() {
            this.number += 1;
        },
        changeMousePosition: function(event) {
            this.x = event.clientX;
            this.y = event.clientY;
        },
        noEvent: function(event) {
            event.preventDefault();
        }
    }
})