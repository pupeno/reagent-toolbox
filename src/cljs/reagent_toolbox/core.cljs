;;;; Copyright © 2017 Flexpoint Tech Ltd

(ns reagent-toolbox.core
  (:refer-clojure :exclude [list])
  (:require cljsjs.react-toolbox
            [reagent.core :as reagent]))

(defn- as-element-by-key
  "Given a map of properties and a list of keys, if those are present and are not strings, it'll treat them as Reagent
   components and wrap them with as-element so they can be used as React components."
  [properties keys-to-componetize]
  (into {}
        (map (fn [[key value]]
               [key (if (and (some #{key} keys-to-componetize)
                             (not (string? value)))
                      (reagent/as-element value)
                      value)])
             properties)))

(def app-bar (reagent/adapt-react-class (.-AppBar js/ReactToolbox)))

(defn autocomplete [properties]
  (let [autocomplete-component (reagent/adapt-react-class (.-Autocomplete js/ReactToolbox))
        properties (as-element-by-key properties [:error :label])]
    [autocomplete-component properties]))

(def avatar (reagent/adapt-react-class (.-Avatar js/ReactToolbox)))

(def button (reagent/adapt-react-class (.-Button js/ReactToolbox)))

(def card (reagent/adapt-react-class (.-Card js/ReactToolbox)))

(def card-actions (reagent/adapt-react-class (.-CardActions js/ReactToolbox)))

(def card-media (reagent/adapt-react-class (.-CardMedia js/ReactToolbox)))

(def card-text (reagent/adapt-react-class (.-CardText js/ReactToolbox)))

(def card-title (reagent/adapt-react-class (.-CardTitle js/ReactToolbox)))

(def checkbox (reagent/adapt-react-class (.-Checkbox js/ReactToolbox)))

(def chip (reagent/adapt-react-class (.-Chip js/ReactToolbox)))

(def date-picker (reagent/adapt-react-class (.-DatePicker js/ReactToolbox)))

(def dialog (reagent/adapt-react-class (.-Dialog js/ReactToolbox)))

(def drawer (reagent/adapt-react-class (.-Drawer js/ReactToolbox)))

(def dropdown (reagent/adapt-react-class (.-Dropdown js/ReactToolbox)))

(def font-icon (reagent/adapt-react-class (.-FontIcon js/ReactToolbox)))

(def icon-button (reagent/adapt-react-class (.-IconButton js/ReactToolbox)))

(def icon-menu (reagent/adapt-react-class (.-IconMenu js/ReactToolbox)))

(def input (reagent/adapt-react-class (.-Input js/ReactToolbox)))

(def layout (reagent/adapt-react-class (.-Layout js/ReactToolbox)))

(def link (reagent/adapt-react-class (.-Link js/ReactToolbox)))

(def list (reagent/adapt-react-class (.-List js/ReactToolbox)))

(def list-checkbox (reagent/adapt-react-class (.-ListCheckbox js/ReactToolbox)))

(def list-divider (reagent/adapt-react-class (.-ListDivider js/ReactToolbox)))

(defn list-item [args]
  (let [list-item-component (reagent/adapt-react-class (.-ListItem js/ReactToolbox))
        args (assoc args
               :left-actions (map reagent/as-element (:left-actions args))
               :right-actions (map reagent/as-element (:right-actions args)))]
    [list-item-component args]))

(def list-sub-header (reagent/adapt-react-class (.-ListSubHeader js/ReactToolbox)))

(def menu-divider (reagent/adapt-react-class (.-MenuDivider js/ReactToolbox)))

(def menu-item (reagent/adapt-react-class (.-MenuItem js/ReactToolbox)))

(def nav-drawer (reagent/adapt-react-class (.-NavDrawer js/ReactToolbox)))

(def navigation (reagent/adapt-react-class (.-Navigation js/ReactToolbox)))

(def panel (reagent/adapt-react-class (.-Panel js/ReactToolbox)))

(def progress-bar (reagent/adapt-react-class (.-ProgressBar js/ReactToolbox)))

(def radio-button (reagent/adapt-react-class (.-RadioButton js/ReactToolbox)))

(def radio-group (reagent/adapt-react-class (.-RadioGroup js/ReactToolbox)))

(def ripple (reagent/adapt-react-class (.-Ripple js/ReactToolbox)))

(def sidebar (reagent/adapt-react-class (.-Sidebar js/ReactToolbox)))

(def slider (reagent/adapt-react-class (.-Slider js/ReactToolbox)))

(def snackbar (reagent/adapt-react-class (.-Snackbar js/ReactToolbox)))

(def switch (reagent/adapt-react-class (.-Switch js/ReactToolbox)))

(def tab (reagent/adapt-react-class (.-Tab js/ReactToolbox)))

(def table (reagent/adapt-react-class (.-Table js/ReactToolbox)))

(def tabs (reagent/adapt-react-class (.-Tabs js/ReactToolbox)))

(def time-picker (reagent/adapt-react-class (.-TimePicker js/ReactToolbox)))

(def tooltip (reagent/adapt-react-class (.-Tooltip js/ReactToolbox)))