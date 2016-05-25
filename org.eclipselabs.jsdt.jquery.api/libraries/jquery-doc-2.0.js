var jQueryObject = { };
jQueryObject.prototype = {
/**
 * Create a new jQuery object with elements added to the set of matched elements.
 * @since 1.0
 * @param {Selector} selector A string representing a selector expression to find additional elements to add to the set of matched elements.
 * @returns {jQueryObject}
 */
add: function(selector) {},
/**
 * Add the previous set of elements on the stack to the current set, optionally filtered by a selector.
 * @since 1.8
 * @param {Selector} [selector] A string containing a selector expression to match the current set of elements against.
 * @returns {jQueryObject}
 */
addBack: function(selector) {},
/**
 * Adds the specified class(es) to each element in the set of matched elements.
 * @since 1.0
 * @param {String} className One or more space-separated classes to be added to the class attribute of each matched element.
 * @returns {jQueryObject}
 */
addClass: function(className) {},
/**
 * Insert content, specified by the parameter, after each element in the set of matched elements.
 * @since 1.0
 * @param {Array} content HTML string, DOM element, array of elements, or jQuery object to insert after each element in the set of matched elements.
 * @param {Array} [content] One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert after each element in the set of matched elements.
 * @returns {jQueryObject}
 */
after: function(content, content) {},
/**
 * Add the previous set of elements on the stack to the current set.
 * @since 1.2
 * @deprecated 1.8
 * @returns {jQueryObject}
 */
andSelf: function() {},
/**
 * Perform a custom animation of a set of CSS properties.
 * @since 1.0
 * @param {PlainObject} properties An object of CSS properties and values that the animation will move toward.
 * @param {Number} [duration=400] A string or number determining how long the animation will run.
 * @param {String} [easing=swing] A string indicating which easing function to use for the transition.
 * @param {Function} [complete] A function to call once the animation is complete.
 * @returns {jQueryObject}
 */
animate: function(properties, duration, easing, complete) {},
/**
 * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
 * @since 1.0
 * @param {Array} content DOM element, array of elements, HTML string, or jQuery object to insert at the end of each element in the set of matched elements.
 * @param {Array} [content] One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the end of each element in the set of matched elements.
 * @returns {jQueryObject}
 */
append: function(content, content) {},
/**
 * Insert every element in the set of matched elements to the end of the target.
 * @since 1.0
 * @param {Array} target A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements will be inserted at the end of the element(s) specified by this parameter.
 * @returns {jQueryObject}
 */
appendTo: function(target) {},
/**
 * Get the value of an attribute for the first element in the set of matched elements.
 * @since 1.0
 * @param {String} attributeName The name of the attribute to get.
 * @returns {String}
 */
attr: function(attributeName) {},
/**
 * Set one or more attributes for the set of matched elements.
 * @since 1.0
 * @param {String} attributeName The name of the attribute to set.
 * @param {Number} value A value to set for the attribute.
 * @returns {jQueryObject}
 */
attr: function(attributeName, value) {},
/**
 * Insert content, specified by the parameter, before each element in the set of matched elements.
 * @since 1.0
 * @param {Array} content HTML string, DOM element, array of elements, or jQuery object to insert before each element in the set of matched elements.
 * @param {Array} [content] One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert before each element in the set of matched elements.
 * @returns {jQueryObject}
 */
before: function(content, content) {},
/**
 * Attach a handler to an event for the elements.
 * @since 1.0
 * @param {String} eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
 * @param {Anything} [eventData] An object containing data that will be passed to the event handler.
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
bind: function(eventType, eventData, handler) {},
/**
 * Bind an event handler to the "blur" JavaScript event, or trigger that event on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
blur: function(handler) {},
/**
 * Bind an event handler to the "change" JavaScript event, or trigger that event on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
change: function(handler) {},
/**
 * Get the children of each element in the set of matched elements, optionally filtered by a selector.
 * @since 1.0
 * @param {Selector} [selector] A string containing a selector expression to match elements against.
 * @returns {jQueryObject}
 */
children: function(selector) {},
/**
 * Remove from the queue all items that have not yet been run.
 * @since 1.4
 * @param {String} [queueName] A string containing the name of the queue. Defaults to <code>fx</code>, the standard effects queue.
 * @returns {jQueryObject}
 */
clearQueue: function(queueName) {},
/**
 * Bind an event handler to the "click" JavaScript event, or trigger that event on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
click: function(handler) {},
/**
 * Create a deep copy of the set of matched elements.
 * @since 1.0
 * @param {Boolean} [withDataAndEvents=false] A Boolean indicating whether event handlers should be copied along with the elements. As of jQuery 1.4, element data will be copied as well.
 * @returns {jQueryObject}
 */
clone: function(withDataAndEvents) {},
/**
 * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
 * @since 1.3
 * @param {Selector} selector A string containing a selector expression to match elements against.
 * @returns {jQueryObject}
 */
closest: function(selector) {},
/**
 * Get the children of each element in the set of matched elements, including text and comment nodes.
 * @since 1.2
 * @returns {jQueryObject}
 */
contents: function() {},
/**
 * The DOM node context originally passed to <code>jQuery()</code>; if none was passed then context will likely be the document.
 * @deprecated 1.10
 * @type {Element}
 */
context: null,
/**
 * Get the computed style properties for the first element in the set of matched elements.
 * @since 1.0
 * @param {String} propertyName A CSS property.
 * @returns {String}
 */
css: function(propertyName) {},
/**
 * Set one or more CSS properties for the set of matched elements.
 * @since 1.0
 * @param {String} propertyName A CSS property name.
 * @param {Number} value A value to set for the property.
 * @returns {jQueryObject}
 */
css: function(propertyName, value) {},
/**
 * Store arbitrary data associated with the matched elements.
 * @since 1.2
 * @param {String} key A string naming the piece of data to set.
 * @param {Anything} value The new data value; this can be any Javascript type except <code>undefined</code>.
 * @returns {jQueryObject}
 */
data: function(key, value) {},
/**
 * Return the value at the named data store for the first element in the jQuery collection, as set by data(name, value) or by an HTML5 data-* attribute.
 * @since 1.2
 * @param {String} key Name of the data stored.
 * @returns {Object}
 */
data: function(key) {},
/**
 * Bind an event handler to the "dblclick" JavaScript event, or trigger that event on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
dblclick: function(handler) {},
/**
 * Set a timer to delay execution of subsequent items in the queue.
 * @since 1.4
 * @param {Integer} duration An integer indicating the number of milliseconds to delay execution of the next item in the queue.
 * @param {String} [queueName] A string containing the name of the queue. Defaults to <code>fx</code>, the standard effects queue.
 * @returns {jQueryObject}
 */
delay: function(duration, queueName) {},
/**
 * Attach a handler to one or more events for all elements that match the selector, now or in the future, based on a specific set of root elements.
 * @since 1.4
 * @param {String} selector A selector to filter the elements that trigger the event.
 * @param {String} eventType A string containing one or more space-separated JavaScript event types, such as "click" or "keydown," or custom event names.
 * @param {Function} handler A function to execute at the time the event is triggered.
 * @returns {jQueryObject}
 */
delegate: function(selector, eventType, handler) {},
/**
 * Execute the next function on the queue for the matched elements.
 * @since 1.2
 * @param {String} [queueName] A string containing the name of the queue. Defaults to <code>fx</code>, the standard effects queue.
 * @returns {jQueryObject}
 */
dequeue: function(queueName) {},
/**
 * Remove the set of matched elements from the DOM.
 * @since 1.4
 * @param {Selector} [selector] A selector expression that filters the set of matched elements to be removed.
 * @returns {jQueryObject}
 */
detach: function(selector) {},
/**
 * Iterate over a jQuery object, executing a function for each matched element. 
 * @since 1.0
 * @param {Function} func A function to execute for each matched element.
 * @returns {jQueryObject}
 */
each: function(func) {},
/**
 * Remove all child nodes of the set of matched elements from the DOM.
 * @since 1.0
 * @returns {jQueryObject}
 */
empty: function() {},
/**
 * End the most recent filtering operation in the current chain and return the set of matched elements to its previous state.
 * @since 1.0
 * @returns {jQueryObject}
 */
end: function() {},
/**
 * Reduce the set of matched elements to the one at the specified index.
 * @since 1.1
 * @param {Integer} index An integer indicating the 0-based position of the element. 
 * @returns {jQueryObject}
 */
eq: function(index) {},
/**
 * Bind an event handler to the "error" JavaScript event.
 * @since 1.0
 * @deprecated 1.8
 * @param {Function} handler A function to execute when the event is triggered.
 * @returns {jQueryObject}
 */
error: function(handler) {},
/**
 * Display the matched elements by fading them to opaque.
 * @since 1.0
 * @param {Number} [duration=400] A string or number determining how long the animation will run.
 * @param {Function} [complete] A function to call once the animation is complete.
 * @returns {jQueryObject}
 */
fadeIn: function(duration, complete) {},
/**
 * Hide the matched elements by fading them to transparent.
 * @since 1.0
 * @param {Number} [duration=400] A string or number determining how long the animation will run.
 * @param {Function} [complete] A function to call once the animation is complete.
 * @returns {jQueryObject}
 */
fadeOut: function(duration, complete) {},
/**
 * Adjust the opacity of the matched elements.
 * @since 1.0
 * @param {Number} duration A string or number determining how long the animation will run.
 * @param {Number} opacity A number between 0 and 1 denoting the target opacity.
 * @param {Function} [complete] A function to call once the animation is complete.
 * @returns {jQueryObject}
 */
fadeTo: function(duration, opacity, complete) {},
/**
 * Display or hide the matched elements by animating their opacity.
 * @since 1.4
 * @param {Number} [duration=400] A string or number determining how long the animation will run.
 * @param {String} [easing=swing] A string indicating which easing function to use for the transition.
 * @param {Function} [complete] A function to call once the animation is complete.
 * @returns {jQueryObject}
 */
fadeToggle: function(duration, easing, complete) {},
/**
 * Reduce the set of matched elements to those that match the selector or pass the function's test. 
 * @since 1.0
 * @param {Selector} selector A string containing a selector expression to match the current set of elements against.
 * @returns {jQueryObject}
 */
filter: function(selector) {},
/**
 * Get the descendants of each element in the current set of matched elements, filtered by a selector, jQuery object, or element.
 * @since 1.0
 * @param {Selector} selector A string containing a selector expression to match elements against.
 * @returns {jQueryObject}
 */
find: function(selector) {},
/**
 * Stop the currently-running animation, remove all queued animations, and complete all animations for the matched elements.
 * @since 1.9
 * @param {String} [queue='fx'] The name of the queue in which to stop animations.
 * @returns {jQueryObject}
 */
finish: function(queue) {},
/**
 * Reduce the set of matched elements to the first in the set.
 * @since 1.4
 * @returns {jQueryObject}
 */
first: function() {},
/**
 * Bind an event handler to the "focus" JavaScript event, or trigger that event on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
focus: function(handler) {},
/**
 * Bind an event handler to the "focusin" event.
 * @since 1.4
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
focusin: function(handler) {},
/**
 * Bind an event handler to the "focusout" JavaScript event.
 * @since 1.4
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
focusout: function(handler) {},
/**
 * Retrieve one of the elements matched by the jQuery object.
 * @since 1.0
 * @param {Integer} index A zero-based integer indicating which element to retrieve.
 * @returns {Element}
 */
get: function(index) {},
/**
 * Retrieve the elements matched by the jQuery object.
 * @since 1.0
 * @returns {Array}
 */
get: function() {},
/**
 * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
 * @since 1.4
 * @param {String} selector A string containing a selector expression to match elements against.
 * @returns {jQueryObject}
 */
has: function(selector) {},
/**
 * Determine whether any of the matched elements are assigned the given class.
 * @since 1.2
 * @param {String} className The class name to search for.
 * @returns {Boolean}
 */
hasClass: function(className) {},
/**
 * Get the current computed height for the first element in the set of matched elements.
 * @since 1.0
 * @returns {Number}
 */
height: function() {},
/**
 * Set the CSS height of every matched element.
 * @since 1.0
 * @param {Number} value An integer representing the number of pixels, or an integer with an optional unit of measure appended (as a string).
 * @returns {jQueryObject}
 */
height: function(value) {},
/**
 * Hide the matched elements.
 * @since 1.0
 * @returns {jQueryObject}
 */
hide: function() {},
/**
 * Bind two handlers to the matched elements, to be executed when the mouse pointer enters and leaves the elements.
 * @since 1.0
 * @param {Function} handlerIn A function to execute when the mouse pointer enters the element.
 * @param {Function} handlerOut A function to execute when the mouse pointer leaves the element.
 * @returns {jQueryObject}
 */
hover: function(handlerIn, handlerOut) {},
/**
 * Bind a single handler to the matched elements, to be executed when the mouse pointer enters or leaves the elements.
 * @since 1.4
 * @param {Function} handlerInOut A function to execute when the mouse pointer enters or leaves the element.
 * @returns {jQueryObject}
 */
hover: function(handlerInOut) {},
/**
 * Get the HTML contents of the first element in the set of matched elements.
 * @since 1.0
 * @returns {String}
 */
html: function() {},
/**
 * Set the HTML contents of each element in the set of matched elements.
 * @since 1.0
 * @param {htmlString} htmlString A string of HTML to set as the content of each matched element.
 * @returns {jQueryObject}
 */
html: function(htmlString) {},
/**
 * Search for a given element from among the matched elements.
 * @since 1.4
 * @returns {Number}
 */
index: function() {},
/**
 * Get the current computed height for the first element in the set of matched elements, including padding but not border.
 * @since 1.2
 * @returns {Number}
 */
innerHeight: function() {},
/**
 * Set the CSS inner height of each element in the set of matched elements.
 * @since 1.8
 * @param {Number} value A number representing the number of pixels, or a number along with an optional unit of measure appended (as a string).
 * @returns {jQueryObject}
 */
innerHeight: function(value) {},
/**
 * Get the current computed inner width for the first element in the set of matched elements, including padding but not border.
 * @since 1.2
 * @returns {Number}
 */
innerWidth: function() {},
/**
 * Set the CSS inner width of each element in the set of matched elements.
 * @since 1.8
 * @param {Number} value A number representing the number of pixels, or a number along with an optional unit of measure appended (as a string).
 * @returns {jQueryObject}
 */
innerWidth: function(value) {},
/**
 * Insert every element in the set of matched elements after the target.
 * @since 1.0
 * @param {Array} target A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted after the element(s) specified by this parameter.
 * @returns {jQueryObject}
 */
insertAfter: function(target) {},
/**
 * Insert every element in the set of matched elements before the target.
 * @since 1.0
 * @param {Array} target A selector, element, array of elements, HTML string, or jQuery object; the matched set of elements will be inserted before the element(s) specified by this parameter.
 * @returns {jQueryObject}
 */
insertBefore: function(target) {},
/**
 * Check the current matched set of elements against a selector, element, or jQuery object and return <code>true</code> if at least one of these elements matches the given arguments.
 * @since 1.0
 * @param {Selector} selector A string containing a selector expression to match elements against.
 * @returns {Boolean}
 */
is: function(selector) {},
/**
 * Accepts a string containing a CSS selector which is then used to match a set of elements.
 * @since 1.0
 * @param {Selector} selector A string containing a selector expression
 * @param {Element} [context] A DOM Element, Document, or jQuery to use as context
 * @returns {jQueryObject}
 */
jQuery: function(selector, context) {},
/**
 * Creates DOM elements on the fly from the provided string of raw HTML.
 * @since 1.0
 * @param {htmlString} html A string of HTML to create on the fly. Note that this parses HTML, <strong>not</strong> XML.
 * @param {document} [ownerDocument] A document in which the new elements will be created.
 * @returns {jQueryObject}
 */
jQuery: function(html, ownerDocument) {},
/**
 * Binds a function to be executed when the DOM has finished loading.
 * @since 1.0
 * @param {Function} callback The function to execute when the DOM is ready.
 * @returns {jQueryObject}
 */
jQuery: function(callback) {},
/**
 * A string containing the jQuery version number.
 * @type {String}
 */
jquery: "",
/**
 * Bind an event handler to the "keydown" JavaScript event, or trigger that event on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
keydown: function(handler) {},
/**
 * Bind an event handler to the "keypress" JavaScript event, or trigger that event on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
keypress: function(handler) {},
/**
 * Bind an event handler to the "keyup" JavaScript event, or trigger that event on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
keyup: function(handler) {},
/**
 * Reduce the set of matched elements to the final one in the set.
 * @since 1.4
 * @returns {jQueryObject}
 */
last: function() {},
/**
 * The number of elements in the jQuery object.
 * @type {Integer}
 */
length: 1,
/**
 * Bind an event handler to the "load" JavaScript event.
 * @since 1.0
 * @deprecated 1.8
 * @param {Function} handler A function to execute when the event is triggered.
 * @returns {jQueryObject}
 */
load: function(handler) {},
/**
 * Load data from the server and place the returned HTML into the matched element.
 * @since 1.0
 * @param {String} url A string containing the URL to which the request is sent.
 * @param {PlainObject} [data] A plain object or string that is sent to the server with the request.
 * @param {Function} [complete] A callback function that is executed when the request completes.
 * @returns {jQueryObject}
 */
load: function(url, data, complete) {},
/**
 * Pass each element in the current matched set through a function, producing a new jQuery object containing the return values.
 * @since 1.2
 * @param {Function} callback A function object that will be invoked for each element in the current set.
 * @returns {jQueryObject}
 */
map: function(callback) {},
/**
 * Bind an event handler to the "mousedown" JavaScript event, or trigger that event on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
mousedown: function(handler) {},
/**
 * Bind an event handler to be fired when the mouse enters an element, or trigger that handler on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
mouseenter: function(handler) {},
/**
 * Bind an event handler to be fired when the mouse leaves an element, or trigger that handler on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
mouseleave: function(handler) {},
/**
 * Bind an event handler to the "mousemove" JavaScript event, or trigger that event on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
mousemove: function(handler) {},
/**
 * Bind an event handler to the "mouseout" JavaScript event, or trigger that event on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
mouseout: function(handler) {},
/**
 * Bind an event handler to the "mouseover" JavaScript event, or trigger that event on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
mouseover: function(handler) {},
/**
 * Bind an event handler to the "mouseup" JavaScript event, or trigger that event on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
mouseup: function(handler) {},
/**
 * Get the immediately following sibling of each element in the set of matched elements. If a selector is provided, it retrieves the next sibling only if it matches that selector.
 * @since 1.0
 * @param {Selector} [selector] A string containing a selector expression to match elements against.
 * @returns {jQueryObject}
 */
next: function(selector) {},
/**
 * Get all following siblings of each element in the set of matched elements, optionally filtered by a selector.
 * @since 1.2
 * @param {String} [selector] A string containing a selector expression to match elements against.
 * @returns {jQueryObject}
 */
nextAll: function(selector) {},
/**
 * Get all following siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object passed.
 * @since 1.4
 * @param {Selector} [selector] A string containing a selector expression to indicate where to stop matching following sibling elements.
 * @param {Selector} [filter] A string containing a selector expression to match elements against.
 * @returns {jQueryObject}
 */
nextUntil: function(selector, filter) {},
/**
 * Remove elements from the set of matched elements.
 * @since 1.0
 * @param {Array} selector A string containing a selector expression, a DOM element, or an array of elements to match against the set.
 * @returns {jQueryObject}
 */
not: function(selector) {},
/**
 * Remove an event handler.
 * @since 1.7
 * @param {String} events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
 * @param {String} [selector] A selector which should match the one originally passed to <code>.on()</code> when attaching event handlers.
 * @param {Function} [handler] A handler function previously attached for the event(s), or the special value <code>false</code>.
 * @returns {jQueryObject}
 */
off: function(events, selector, handler) {},
/**
 * Get the current coordinates of the first element in the set of matched elements, relative to the document.
 * @since 1.2
 * @returns {Object}
 */
offset: function() {},
/**
 * Set the current coordinates of every element in the set of matched elements, relative to the document.
 * @since 1.4
 * @param {PlainObject} coordinates An object containing the properties <code>top</code> and <code>left</code>, which are numbers indicating the new top and left coordinates for the elements.
 * @returns {jQueryObject}
 */
offset: function(coordinates) {},
/**
 * Get the closest ancestor element that is positioned.
 * @since 1.2
 * @returns {jQueryObject}
 */
offsetParent: function() {},
/**
 * Attach an event handler function for one or more events to the selected elements.
 * @since 1.7
 * @param {String} events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
 * @param {String} [selector] A selector string to filter the descendants of the selected elements that trigger the event. If the selector is <code>null</code> or omitted, the event is always triggered when it reaches the selected element.
 * @param {Anything} [data] Data to be passed to the handler in <a><code>event.data</code></a> when an event is triggered.
 * @param {Function} handler A function to execute when the event is triggered. The value <code>false</code> is also allowed as a shorthand for a function that simply does <code>return false</code>.
 * @returns {jQueryObject}
 */
on: function(events, selector, data, handler) {},
/**
 * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
 * @since 1.1
 * @param {String} events A string containing one or more JavaScript event types, such as "click" or "submit," or custom event names.
 * @param {PlainObject} [data] An object containing data that will be passed to the event handler.
 * @param {Function} handler A function to execute at the time the event is triggered.
 * @returns {jQueryObject}
 */
one: function(events, data, handler) {},
/**
 * Get the current computed height for the first element in the set of matched elements, including padding, border, and optionally margin. Returns a number (without "px") representation of the value or null if called on an empty set of elements.
 * @since 1.2
 * @param {Boolean} [includeMargin] A Boolean indicating whether to include the element's margin in the calculation.
 * @returns {Number}
 */
outerHeight: function(includeMargin) {},
/**
 * Set the CSS outer Height of each element in the set of matched elements.
 * @since 1.8
 * @param {Number} value A number representing the number of pixels, or a number along with an optional unit of measure appended (as a string).
 * @returns {jQueryObject}
 */
outerHeight: function(value) {},
/**
 * Get the current computed width for the first element in the set of matched elements, including padding and border.
 * @since 1.2
 * @param {Boolean} [includeMargin] A Boolean indicating whether to include the element's margin in the calculation.
 * @returns {Number}
 */
outerWidth: function(includeMargin) {},
/**
 * Set the CSS outer width of each element in the set of matched elements.
 * @since 1.8
 * @param {Number} value A number representing the number of pixels, or a number along with an optional unit of measure appended (as a string).
 * @returns {jQueryObject}
 */
outerWidth: function(value) {},
/**
 * Get the parent of each element in the current set of matched elements, optionally filtered by a selector.
 * @since 1.0
 * @param {Selector} [selector] A string containing a selector expression to match elements against.
 * @returns {jQueryObject}
 */
parent: function(selector) {},
/**
 * Get the ancestors of each element in the current set of matched elements, optionally filtered by a selector.
 * @since 1.0
 * @param {Selector} [selector] A string containing a selector expression to match elements against.
 * @returns {jQueryObject}
 */
parents: function(selector) {},
/**
 * Get the ancestors of each element in the current set of matched elements, up to but not including the element matched by the selector, DOM node, or jQuery object.
 * @since 1.4
 * @param {Selector} [selector] A string containing a selector expression to indicate where to stop matching ancestor elements.
 * @param {Selector} [filter] A string containing a selector expression to match elements against.
 * @returns {jQueryObject}
 */
parentsUntil: function(selector, filter) {},
/**
 * Get the current coordinates of the first element in the set of matched elements, relative to the offset parent.
 * @since 1.2
 * @returns {Object}
 */
position: function() {},
/**
 * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
 * @since 1.0
 * @param {Array} content DOM element, array of elements, HTML string, or jQuery object to insert at the beginning of each element in the set of matched elements.
 * @param {Array} [content] One or more additional DOM elements, arrays of elements, HTML strings, or jQuery objects to insert at the beginning of each element in the set of matched elements.
 * @returns {jQueryObject}
 */
prepend: function(content, content) {},
/**
 * Insert every element in the set of matched elements to the beginning of the target.
 * @since 1.0
 * @param {Array} target A selector, element, HTML string, array of elements, or jQuery object; the matched set of elements will be inserted at the beginning of the element(s) specified by this parameter.
 * @returns {jQueryObject}
 */
prependTo: function(target) {},
/**
 * Get the immediately preceding sibling of each element in the set of matched elements, optionally filtered by a selector.
 * @since 1.0
 * @param {Selector} [selector] A string containing a selector expression to match elements against.
 * @returns {jQueryObject}
 */
prev: function(selector) {},
/**
 * Get all preceding siblings of each element in the set of matched elements, optionally filtered by a selector.
 * @since 1.2
 * @param {Selector} [selector] A string containing a selector expression to match elements against.
 * @returns {jQueryObject}
 */
prevAll: function(selector) {},
/**
 * Get all preceding siblings of each element up to but not including the element matched by the selector, DOM node, or jQuery object.
 * @since 1.4
 * @param {Selector} [selector] A string containing a selector expression to indicate where to stop matching preceding sibling elements.
 * @param {Selector} [filter] A string containing a selector expression to match elements against.
 * @returns {jQueryObject}
 */
prevUntil: function(selector, filter) {},
/**
 *  Return a Promise object to observe when all actions of a certain type bound to the collection, queued or not, have finished. 
 * @since 1.6
 * @param {String} [type=fx]  The type of queue that needs to be observed. 
 * @param {PlainObject} [target] Object onto which the promise methods have to be attached
 * @returns {Promise}
 */
promise: function(type, target) {},
/**
 * Get the value of a property for the first element in the set of matched elements.
 * @since 1.6
 * @param {String} propertyName The name of the property to get.
 */
prop: function(propertyName) {},
/**
 * Set one or more properties for the set of matched elements.
 * @since 1.6
 * @param {String} propertyName The name of the property to set.
 * @param {Anything} value A value to set for the property.
 * @returns {jQueryObject}
 */
prop: function(propertyName, value) {},
/**
 * Add a collection of DOM elements onto the jQuery stack.
 * @since 1.0
 * @param {Array} elements An array of elements to push onto the stack and make into a new jQuery object.
 * @returns {jQueryObject}
 */
pushStack: function(elements) {},
/**
 * Show the queue of functions to be executed on the matched elements.
 * @since 1.2
 * @param {String} [queueName] A string containing the name of the queue. Defaults to <code>fx</code>, the standard effects queue.
 * @returns {Array}
 */
queue: function(queueName) {},
/**
 * Manipulate the queue of functions to be executed, once for each matched element.
 * @since 1.2
 * @param {String} [queueName] A string containing the name of the queue. Defaults to <code>fx</code>, the standard effects queue.
 * @param {Array} newQueue An array of functions to replace the current queue contents.
 * @returns {jQueryObject}
 */
queue: function(queueName, newQueue) {},
/**
 * Specify a function to execute when the DOM is fully loaded.
 * @since 1.0
 * @param {Function} handler A function to execute after the DOM is ready.
 * @returns {jQueryObject}
 */
ready: function(handler) {},
/**
 * Remove the set of matched elements from the DOM.
 * @since 1.0
 * @param {String} [selector] A selector expression that filters the set of matched elements to be removed.
 * @returns {jQueryObject}
 */
remove: function(selector) {},
/**
 * Remove an attribute from each element in the set of matched elements.
 * @since 1.0
 * @param {String} attributeName An attribute to remove; as of version 1.7, it can be a space-separated list of attributes.
 * @returns {jQueryObject}
 */
removeAttr: function(attributeName) {},
/**
 * Remove a single class, multiple classes, or all classes from each element in the set of matched elements.
 * @since 1.0
 * @param {String} [className] One or more space-separated classes to be removed from the class attribute of each matched element.
 * @returns {jQueryObject}
 */
removeClass: function(className) {},
/**
 * Remove a previously-stored piece of data.
 * @since 1.2
 * @param {String} [name] A string naming the piece of data to delete.
 * @returns {jQueryObject}
 */
removeData: function(name) {},
/**
 * Remove a property for the set of matched elements.
 * @since 1.6
 * @param {String} propertyName The name of the property to remove.
 * @returns {jQueryObject}
 */
removeProp: function(propertyName) {},
/**
 * Replace each target element with the set of matched elements.
 * @since 1.2
 * @param {Array} target A selector string, jQuery object, DOM element, or array of elements indicating which element(s) to replace.
 * @returns {jQueryObject}
 */
replaceAll: function(target) {},
/**
 * Replace each element in the set of matched elements with the provided new content and return the set of elements that was removed.
 * @since 1.2
 * @param {Array} newContent The content to insert. May be an HTML string, DOM element, array of DOM elements, or jQuery object.
 * @returns {jQueryObject}
 */
replaceWith: function(newContent) {},
/**
 * Bind an event handler to the "resize" JavaScript event, or trigger that event on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
resize: function(handler) {},
/**
 * Bind an event handler to the "scroll" JavaScript event, or trigger that event on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
scroll: function(handler) {},
/**
 * Get the current horizontal position of the scroll bar for the first element in the set of matched elements.
 * @since 1.2
 * @returns {Integer}
 */
scrollLeft: function() {},
/**
 * Set the current horizontal position of the scroll bar for each of the set of matched elements.
 * @since 1.2
 * @param {Number} value An integer indicating the new position to set the scroll bar to.
 * @returns {jQueryObject}
 */
scrollLeft: function(value) {},
/**
 * Get the current vertical position of the scroll bar for the first element in the set of matched elements or set the vertical position of the scroll bar for every matched element.
 * @since 1.2
 * @returns {Integer}
 */
scrollTop: function() {},
/**
 * Set the current vertical position of the scroll bar for each of the set of matched elements.
 * @since 1.2
 * @param {Number} value An integer indicating the new position to set the scroll bar to.
 * @returns {jQueryObject}
 */
scrollTop: function(value) {},
/**
 * Bind an event handler to the "select" JavaScript event, or trigger that event on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
select: function(handler) {},
/**
 * Encode a set of form elements as a string for submission.
 * @since 1.0
 * @returns {String}
 */
serialize: function() {},
/**
 * Encode a set of form elements as an array of names and values.
 * @since 1.2
 * @returns {Array}
 */
serializeArray: function() {},
/**
 * Display the matched elements.
 * @since 1.0
 * @returns {jQueryObject}
 */
show: function() {},
/**
 * Get the siblings of each element in the set of matched elements, optionally filtered by a selector.
 * @since 1.0
 * @param {Selector} [selector] A string containing a selector expression to match elements against.
 * @returns {jQueryObject}
 */
siblings: function(selector) {},
/**
 * Return the number of elements in the jQuery object.
 * @since 1.0
 * @deprecated 1.8
 * @returns {Integer}
 */
size: function() {},
/**
 * Reduce the set of matched elements to a subset specified by a range of indices.
 * @since 1.1
 * @param {Integer} start An integer indicating the 0-based position at which the elements begin to be selected. If negative, it indicates an offset from the end of the set.
 * @param {Integer} [end] An integer indicating the 0-based position at which the elements stop being selected. If negative, it indicates an offset from the end of the set. If omitted, the range continues until the end of the set.
 * @returns {jQueryObject}
 */
slice: function(start, end) {},
/**
 * Display the matched elements with a sliding motion.
 * @since 1.0
 * @param {Number} [duration=400] A string or number determining how long the animation will run.
 * @param {Function} [complete] A function to call once the animation is complete.
 * @returns {jQueryObject}
 */
slideDown: function(duration, complete) {},
/**
 * Display or hide the matched elements with a sliding motion.
 * @since 1.0
 * @param {Number} [duration=400] A string or number determining how long the animation will run.
 * @param {Function} [complete] A function to call once the animation is complete.
 * @returns {jQueryObject}
 */
slideToggle: function(duration, complete) {},
/**
 * Hide the matched elements with a sliding motion.
 * @since 1.0
 * @param {Number} [duration=400] A string or number determining how long the animation will run.
 * @param {Function} [complete] A function to call once the animation is complete.
 * @returns {jQueryObject}
 */
slideUp: function(duration, complete) {},
/**
 * Stop the currently-running animation on the matched elements.
 * @since 1.2
 * @param {Boolean} [clearQueue] A Boolean indicating whether to remove queued animation as well. Defaults to <code>false</code>.
 * @param {Boolean} [jumpToEnd] A Boolean indicating whether to complete the current animation immediately. Defaults to <code>false</code>.
 * @returns {jQueryObject}
 */
stop: function(clearQueue, jumpToEnd) {},
/**
 * Bind an event handler to the "submit" JavaScript event, or trigger that event on an element.
 * @since 1.0
 * @param {Function} handler A function to execute each time the event is triggered.
 * @returns {jQueryObject}
 */
submit: function(handler) {},
/**
 * Get the combined text contents of each element in the set of matched elements, including their descendants.
 * @since 1.0
 * @returns {String}
 */
text: function() {},
/**
 * Set the content of each element in the set of matched elements to the specified text.
 * @since 1.0
 * @param {Number} text The text to set as the content of each matched element. When Number or Boolean is supplied, it will be converted to a String representation.
 * @returns {jQueryObject}
 */
text: function(text) {},
/**
 * Retrieve all the elements contained in the jQuery set, as an array.
 * @since 1.4
 * @returns {Array}
 */
toArray: function() {},
/**
 * Display or hide the matched elements.
 * @since 1.0
 * @param {Number} [duration=400] A string or number determining how long the animation will run.
 * @param {Function} [complete] A function to call once the animation is complete.
 * @returns {jQueryObject}
 */
toggle: function(duration, complete) {},
/**
 * Add or remove one or more classes from each element in the set of matched elements, depending on either the class's presence or the value of the state argument.
 * @since 1.0
 * @param {String} className One or more class names (separated by spaces) to be toggled for each element in the matched set.
 * @returns {jQueryObject}
 */
toggleClass: function(className) {},
/**
 * Execute all handlers and behaviors attached to the matched elements for the given event type.
 * @since 1.0
 * @param {String} eventType A string containing a JavaScript event type, such as <code>click</code> or <code>submit</code>.
 * @param {Array} [extraParameters] Additional parameters to pass along to the event handler.
 * @returns {jQueryObject}
 */
trigger: function(eventType, extraParameters) {},
/**
 * Execute all handlers attached to an element for an event.
 * @since 1.2
 * @param {String} eventType A string containing a JavaScript event type, such as <code>click</code> or <code>submit</code>.
 * @param {Array} [extraParameters] Additional parameters to pass along to the event handler.
 * @returns {Object}
 */
triggerHandler: function(eventType, extraParameters) {},
/**
 * Remove a previously-attached event handler from the elements.
 * @since 1.0
 * @param {String} eventType A string containing a JavaScript event type, such as <code>click</code> or <code>submit</code>.
 * @param {Function} [handler] The function that is to be no longer executed.
 * @returns {jQueryObject}
 */
unbind: function(eventType, handler) {},
/**
 * Remove a handler from the event for all elements which match the current selector, based upon a specific set of root elements.
 * @since 1.4
 * @returns {jQueryObject}
 */
undelegate: function() {},
/**
 * Bind an event handler to the "unload" JavaScript event.
 * @since 1.0
 * @deprecated 1.8
 * @param {Function} handler A function to execute when the event is triggered.
 * @returns {jQueryObject}
 */
unload: function(handler) {},
/**
 * Remove the parents of the set of matched elements from the DOM, leaving the matched elements in their place.
 * @since 1.4
 * @returns {jQueryObject}
 */
unwrap: function() {},
/**
 * Get the current value of the first element in the set of matched elements.
 * @since 1.0
 */
val: function() {},
/**
 * Set the value of each element in the set of matched elements.
 * @since 1.0
 * @param {Number} value A string of text, a number, or an array of strings corresponding to the value of each matched element to set as selected/checked.
 * @returns {jQueryObject}
 */
val: function(value) {},
/**
 * Get the current computed width for the first element in the set of matched elements.
 * @since 1.0
 * @returns {Number}
 */
width: function() {},
/**
 * Set the CSS width of each element in the set of matched elements.
 * @since 1.0
 * @param {Number} value An integer representing the number of pixels, or an integer along with an optional unit of measure appended (as a string).
 * @returns {jQueryObject}
 */
width: function(value) {},
/**
 * Wrap an HTML structure around each element in the set of matched elements.
 * @since 1.0
 * @param {jQuery} wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements. When you pass a jQuery collection containing more than one element, or a selector matching more than one element, the first element will be used.
 * @returns {jQueryObject}
 */
wrap: function(wrappingElement) {},
/**
 * Wrap an HTML structure around all elements in the set of matched elements.
 * @since 1.2
 * @param {jQuery} wrappingElement A selector, element, HTML string, or jQuery object specifying the structure to wrap around the matched elements.
 * @returns {jQueryObject}
 */
wrapAll: function(wrappingElement) {},
/**
 * Wrap an HTML structure around the content of each element in the set of matched elements.
 * @since 1.2
 * @param {jQuery} wrappingElement An HTML snippet, selector expression, jQuery object, or DOM element specifying the structure to wrap around the content of the matched elements.
 * @returns {jQueryObject}
 */
wrapInner: function(wrappingElement) {},
};
var jQueryEvent = { };
jQueryEvent.prototype = {
/**
 *  The current DOM element within the event bubbling phase.  
 * @type {Element}
 */
currentTarget: null,
/**
 * An optional object of data passed to an event method when the current executing handler is bound.  
 * @type {Object}
 */
data: {},
/**
 * The element where the currently-called jQuery event handler was attached.
 * @type {Element}
 */
delegateTarget: null,
/**
 * Returns whether <a>event.preventDefault()</a> was ever called on this event object. 
 * @since 1.3
 * @returns {Boolean}
 */
isDefaultPrevented: function() {},
/**
 *   Returns whether event.stopImmediatePropagation() was ever called on this event object. 
 * @since 1.3
 * @returns {Boolean}
 */
isImmediatePropagationStopped: function() {},
/**
 *   Returns whether <a>event.stopPropagation()</a> was ever called on this event object. 
 * @since 1.3
 * @returns {Boolean}
 */
isPropagationStopped: function() {},
/**
 * Indicates whether the META key was pressed when the event fired.
 * @type {Boolean}
 */
metaKey: true,
/**
 * The namespace specified when the event was triggered.
 * @type {String}
 */
namespace: "",
/**
 * The mouse position relative to the left edge of the document.
 * @type {Number}
 */
pageX: 1,
/**
 * The mouse position relative to the top edge of the document.
 * @type {Number}
 */
pageY: 1,
/**
 * If this method is called, the default action of the event will not be triggered.
 * @since 1.0
 * @returns {undefined}
 */
preventDefault: function() {},
/**
 * The other DOM element involved in the event, if any.
 * @type {Element}
 */
relatedTarget: null,
/**
 * The last value returned by an event handler that was triggered by this event, unless the value was <code>undefined</code>.
 * @type {Object}
 */
result: {},
/**
 * Keeps the rest of the handlers from being executed and prevents the event from bubbling up the DOM tree.
 * @since 1.3
 */
stopImmediatePropagation: function() {},
/**
 * Prevents the event from bubbling up the DOM tree, preventing any parent handlers from being notified of the event.
 * @since 1.0
 */
stopPropagation: function() {},
/**
 *  The DOM element that initiated the event.  
 * @type {Element}
 */
target: null,
/**
 * The difference in milliseconds between the time the browser created the event and January 1, 1970.
 * @type {Number}
 */
timeStamp: 1,
/**
 * Describes the nature of the event.
 * @type {String}
 */
type: "",
/**
 * For key or mouse events, this property indicates the specific key or button that was pressed.
 * @type {Number}
 */
which: 1,
};
var jQueryDeferred = { };
jQueryDeferred.prototype = {
/**
 *  Add handlers to be called when the Deferred object is either resolved or rejected. 
 * @since 1.6
 * @param {Function} alwaysCallbacks 
        A function, or array of functions, that is called when the Deferred is resolved or rejected.
      
 * @param {Function} [alwaysCallbacks] 
        Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
      
 * @returns {jQueryDeferred}
 */
always: function(alwaysCallbacks, alwaysCallbacks) {},
/**
 *  Add handlers to be called when the Deferred object is resolved. 
 * @since 1.5
 * @param {Function} doneCallbacks 
        A function, or array of functions, that are called when the Deferred is resolved.
      
 * @param {Function} [doneCallbacks] 
        Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
      
 * @returns {jQueryDeferred}
 */
done: function(doneCallbacks, doneCallbacks) {},
/**
 *  Add handlers to be called when the Deferred object is rejected. 
 * @since 1.5
 * @param {Function} failCallbacks 
        A function, or array of functions, that are called when the Deferred is rejected.
      
 * @param {Function} [failCallbacks] 
        Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
      
 * @returns {jQueryDeferred}
 */
fail: function(failCallbacks, failCallbacks) {},
/**
 *  Call the progressCallbacks on a Deferred object with the given <code>args</code>. 
 * @since 1.7
 * @param {Object} args 
        Optional arguments that are passed to the progressCallbacks.
      
 * @returns {jQueryDeferred}
 */
notify: function(args) {},
/**
 *  Call the progressCallbacks on a Deferred object with the given context and <code>args</code>. 
 * @since 1.7
 * @param {Object} context 
        Context passed to the progressCallbacks as the <code>this</code> object.
      
 * @param {Array} [args] 
        An optional array of arguments that are passed to the progressCallbacks.
      
 * @returns {jQueryDeferred}
 */
notifyWith: function(context, args) {},
/**
 *  Utility method to filter and/or chain Deferreds.  
 * @since 1.6
 * @deprecated 1.8
 * @param {Function} [doneFilter] 
        An optional function that is called when the Deferred is resolved.
      
 * @param {Function} [failFilter] 
        An optional function that is called when the Deferred is rejected.
      
 * @returns {Promise}
 */
pipe: function(doneFilter, failFilter) {},
/**
 *  Add handlers to be called when the Deferred object generates progress notifications.
 * @since 1.7
 * @param {Array} progressCallbacks 
        A function, or array of functions, to be called when the Deferred generates progress notifications.
      
 * @param {Array} [progressCallbacks] 
        Optional additional function, or array of functions, to be called when the Deferred generates progress notifications.
      
 * @returns {jQueryDeferred}
 */
progress: function(progressCallbacks, progressCallbacks) {},
/**
 *  Return a Deferred's Promise object. 
 * @since 1.5
 * @param {Object} [target] Object onto which the promise methods have to be attached
 * @returns {Promise}
 */
promise: function(target) {},
/**
 *  Reject a Deferred object and call any failCallbacks with the given <code>args</code>. 
 * @since 1.5
 * @param {Anything} [args] 
        Optional arguments that are passed to the failCallbacks.
      
 * @returns {jQueryDeferred}
 */
reject: function(args) {},
/**
 *  Reject a Deferred object and call any failCallbacks with the given <code>context</code> and <code>args</code>. 
 * @since 1.5
 * @param {Object} context 
        Context passed to the failCallbacks as the <code>this</code> object.
      
 * @param {Array} [args] 
        An optional array of arguments that are passed to the failCallbacks.
      
 * @returns {jQueryDeferred}
 */
rejectWith: function(context, args) {},
/**
 *  Resolve a Deferred object and call any doneCallbacks with the given <code>args</code>. 
 * @since 1.5
 * @param {Anything} [args] 
        Optional arguments that are passed to the doneCallbacks.
      
 * @returns {jQueryDeferred}
 */
resolve: function(args) {},
/**
 *  Resolve a Deferred object and call any doneCallbacks with the given <code>context</code> and <code>args</code>. 
 * @since 1.5
 * @param {Object} context 
        Context passed to the doneCallbacks as the <code>this</code> object.
      
 * @param {Array} [args] 
        An optional array of arguments that are passed to the doneCallbacks.
      
 * @returns {jQueryDeferred}
 */
resolveWith: function(context, args) {},
/**
 * Determine the current state of a Deferred object. 
 * @since 1.7
 * @returns {String}
 */
state: function() {},
/**
 * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress. 
 * @since 1.8
 * @param {Function} doneFilter 
        A function that is called when the Deferred is resolved.
      
 * @param {Function} [failFilter] 
        An optional function that is called when the Deferred is rejected.
      
 * @param {Function} [progressFilter] 
        An optional function that is called when progress notifications are sent to the Deferred.
      
 * @returns {Promise}
 */
then: function(doneFilter, failFilter, progressFilter) {},
};
var jQueryXMLHttpRequest = { };
jQueryXMLHttpRequest.prototype = {
/**
 * The state of the request
 * @type {Integer}
 */
readyState: 1,
/**
 * The status of the response to the request. This is the HTTP result code (for example, status is 200 for a successful request).
 * @type {Integer}
 */
status: 1,
/**
 * The response string returned by the HTTP server. Unlike status, this includes the entire text of the response message ("200 OK", for example).
 * @type {String}
 */
statusText: "",
/**
 * The response to the request as a DOM Document object, or null if the request was unsuccessful, has not yet been sent, or cannot be parsed as XML or HTML. The response is parsed as if it were a text/xml stream. When the responseType is set to "document" and the request has been made asynchronously, the response is parsed as a text/html stream.
 * @type {Document}
 */
responseXML: new Document(),
/**
 * Aborts the request if it has already been sent.
 * @since 1.5
 * @returns {void}
 */
abort: function() {},
/**
 * Returns all the response headers as a string, or null if no response has been received. Note: For multipart requests, this returns the headers from the current part of the request, not from the original channel.
 * @since 1.5
 * @returns {String}
 */
getAllResponseHeaders: function() {},
/**
 * Returns the header field value from the response of which the field name matches header, unless the field name is Set-Cookie or Set-Cookie2.
 * @since 1.5
 * @param {String} header the header name
 * @returns {String}
 */
getResponseHeader: function(header) {},
/**
 * Override the mime type. Available in jQuery 1.4.x, as well, temporarily removed in jQuery 1.5 but added again in 1.5.1.
 * @since 1.4
 * @param {String} mimeType the header name
 * @returns {String}
 */
overrideMimeType: function(mimeType) {},
/**
 * statusCode
 * @since 1.5
 * @returns {Object}
 */
statusCode: function() {},
/**
 * An alternative construct to the success callback option, the .done() method replaces the deprecated jqXHR.success() method. Refer to deferred.done() for implementation details.
 * @since 1.5
 * @param {Function} func the callback
 * @returns {jQueryDeferred}
 */
done: function(func) {},
/**
 * An alternative construct to the error callback option, the .fail() method replaces the deprecated .error() method. Refer to deferred.fail() for implementation details. 
 * @since 1.5
 * @param {Function} func the callback
 * @returns {jQueryDeferred}
 */
fail: function(func) {},
/**
 * An alternative construct to the complete callback option, the .always() method replaces the deprecated .complete() method.
 * @since 1.5
 * @param {Function} func the callback
 * @returns {jQueryDeferred}
 */
always: function(func) {},
/**
 * Incorporates the functionality of the .done() and .fail() methods, allowing (as of jQuery 1.8) the underlying Promise to be manipulated. Refer to deferred.then() for implementation details. 
 * @since 1.8
 * @param {Function} func the callback
 * @param {Function} func the callback
 * @returns {jQueryDeferred}
 */
then: function(func, func) {},
/**
 * Refer to deferred.done() for implementation details.
 * @since 1.5
 * @deprecated 1.8
 * @param {Function} func the callback
 * @returns {jQueryDeferred}
 */
success: function(func) {},
/**
 * Refer to deferred.fail() for implementation details. 
 * @since 1.5
 * @deprecated 1.8
 * @param {Function} func the callback
 * @returns {jQueryDeferred}
 */
error: function(func) {},
/**
 * An alternative construct to the complete callback option, the .always() method replaces the deprecated .complete() method.
 * @since 1.5
 * @deprecated 1.8
 * @param {Function} func the callback
 * @returns {jQueryDeferred}
 */
complete: function(func) {},
};
/**
 * Accepts a string containing a CSS selector which is then used to match a set of elements.
 * @returns {jQueryObject}
 */
function jQuery() {};
/**
 * Accepts a string containing a CSS selector which is then used to match a set of elements.
 * @returns {jQueryObject}
 */
function $() {};
