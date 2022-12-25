new Vue({
    el: '#app',
    data: {
        name: よしぴー,
    },
    render: function (h) {
        return h('h1', 'こんにちは、' + this.name)
    },
}).$mount('#app3')

var dir = document.createElement('div');
console.log(dir)