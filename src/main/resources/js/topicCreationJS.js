const textArea = document.querySelector('#textRedactor');

redactorButton.addEventListener('click', () => {
        // Get the content from the TinyMCE editor
        let content = tinymce.get('textRedactor').getContent();

        // Example of sending data using fetch
        fetch('/createTopic', {
                method: 'POST',
                headers: {
                        'Content-Type': 'application/json',
                },
                body: JSON.stringify({ content: content }),
        })
            .then(response => response.json())
            .then(data => {
                    console.log('Data sent successfully:', data);
                    // Add any additional logic here based on the response from the server
            })
            .catch(error => {
                    console.error('Error sending data:', error);
            });
});