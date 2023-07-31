package smith.lib.alerts.dialog.callbacks

/**
 * On feedback callback for FeedbackSDialog.
 */
interface OnFeedbackSubmitCallBack {
    /**
     * triggered when clicking on feedback buttons.
     * @param isLiked returns true if user hit the like button and false if hitting dislike button.
     */
    fun onSubmit(isLiked: Boolean)
}
