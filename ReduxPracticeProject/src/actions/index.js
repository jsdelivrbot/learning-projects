export function selectBook(book) {
	// selectBook is an ActionCreator, it needs to return an action: an object with a type and payload property. Payload describes / clarifies the conditions of the action being triggered.
	return {
		type: 'BOOK_SELECTED',
		payload: book
	};
}