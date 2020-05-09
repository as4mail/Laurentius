/**
 * Thanks to  github.com noamik/primefacesDTRedrawIssue
 * @type Boolean
 */

var isDataTableAdjustmentRunning = false;

function adjustTableColumns(tableName, wrapperName, debug) {
    debug = (typeof debug === 'undefined') ? false : debug;
    if (debug) {
        console.log("Resize detected!");
    }
    if (isDataTableAdjustmentRunning) {
        return;
    } else {
        isDataTableAdjustmentRunning = true;
        renderTable(tableName, wrapperName, debug);
    }
}

function renderTable(tableId, wrapperName, debug) {
    var table = PF(tableId);
   if (table) {

        table.refresh(table.cfg);


    } else {
        console.warn("Couldn't find table: " + tableId);
    }
    isDataTableAdjustmentRunning = false;
}
