
document.addEventListener('DOMContentLoaded', function() {
    const toggleButton = document.querySelector('#toggleContent');
    const content = document.querySelector('#hiddenContent');
    
    toggleButton.addEventListener('click', function() {
        content.classList.toggle('hidden');
    });
});
