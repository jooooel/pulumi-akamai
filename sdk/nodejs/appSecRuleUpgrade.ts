// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * Basic usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as akamai from "@pulumi/akamai";
 *
 * const configuration = akamai.getAppSecConfiguration({
 *     name: "Documentation",
 * });
 * const ruleUpgrade = new akamai.AppSecRuleUpgrade("ruleUpgrade", {
 *     configId: configuration.then(configuration => configuration.configId),
 *     securityPolicyId: "gms1_134637",
 * });
 * export const ruleUpgradeCurrentRuleset = ruleUpgrade.currentRuleset;
 * export const ruleUpgradeMode = ruleUpgrade.mode;
 * export const ruleUpgradeEvalStatus = ruleUpgrade.evalStatus;
 * ```
 * ## Output Options
 *
 * The following options can be used to determine the information returned and how that returned information is formatted:
 *
 * - `currentRuleset`. Versioning information for your current KRS rule set.
 * - `mode`. Specifies the current upgrade mode type. Valid values are:
 *   - **KRS**. Rulesets must be manually upgraded.
 *   
 *   - **AAG**. Rulesets are automatically upgraded by Akamai.
 *   
 *   - **ASE_MANUAL**. Adaptive Security Engine rulesets must be manually upgraded.
 *   
 *   - **ASE_AUTO**. Adaptive Security Engine rulesets are automatically updated by Akamai.
 *
 * - `evalStatus`. Returns **enabled** if an evaluation is currently in progress; otherwise returns **disabled**.
 */
export class AppSecRuleUpgrade extends pulumi.CustomResource {
    /**
     * Get an existing AppSecRuleUpgrade resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppSecRuleUpgradeState, opts?: pulumi.CustomResourceOptions): AppSecRuleUpgrade {
        return new AppSecRuleUpgrade(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/appSecRuleUpgrade:AppSecRuleUpgrade';

    /**
     * Returns true if the given object is an instance of AppSecRuleUpgrade.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppSecRuleUpgrade {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppSecRuleUpgrade.__pulumiType;
    }

    /**
     * . Unique identifier of the security configuration associated with the ruleset being upgraded.
     */
    public readonly configId!: pulumi.Output<number>;
    public /*out*/ readonly currentRuleset!: pulumi.Output<string>;
    public /*out*/ readonly evalStatus!: pulumi.Output<string>;
    public /*out*/ readonly mode!: pulumi.Output<string>;
    /**
     * . Unique identifier of the security policy associated with the ruleset being upgraded.
     * - `upgradeMode`. (Optional). Modifies the upgrade type for organizations running the ASE beta. Allowed values are:
     * - **ASE_AUTO**. Akamai automatically updates your rulesets.
     * - **ASE_MANUAL**. Manually updates your rulesets.
     */
    public readonly securityPolicyId!: pulumi.Output<string>;
    public readonly upgradeMode!: pulumi.Output<string | undefined>;

    /**
     * Create a AppSecRuleUpgrade resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppSecRuleUpgradeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppSecRuleUpgradeArgs | AppSecRuleUpgradeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppSecRuleUpgradeState | undefined;
            resourceInputs["configId"] = state ? state.configId : undefined;
            resourceInputs["currentRuleset"] = state ? state.currentRuleset : undefined;
            resourceInputs["evalStatus"] = state ? state.evalStatus : undefined;
            resourceInputs["mode"] = state ? state.mode : undefined;
            resourceInputs["securityPolicyId"] = state ? state.securityPolicyId : undefined;
            resourceInputs["upgradeMode"] = state ? state.upgradeMode : undefined;
        } else {
            const args = argsOrState as AppSecRuleUpgradeArgs | undefined;
            if ((!args || args.configId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configId'");
            }
            if ((!args || args.securityPolicyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityPolicyId'");
            }
            resourceInputs["configId"] = args ? args.configId : undefined;
            resourceInputs["securityPolicyId"] = args ? args.securityPolicyId : undefined;
            resourceInputs["upgradeMode"] = args ? args.upgradeMode : undefined;
            resourceInputs["currentRuleset"] = undefined /*out*/;
            resourceInputs["evalStatus"] = undefined /*out*/;
            resourceInputs["mode"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AppSecRuleUpgrade.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppSecRuleUpgrade resources.
 */
export interface AppSecRuleUpgradeState {
    /**
     * . Unique identifier of the security configuration associated with the ruleset being upgraded.
     */
    configId?: pulumi.Input<number>;
    currentRuleset?: pulumi.Input<string>;
    evalStatus?: pulumi.Input<string>;
    mode?: pulumi.Input<string>;
    /**
     * . Unique identifier of the security policy associated with the ruleset being upgraded.
     * - `upgradeMode`. (Optional). Modifies the upgrade type for organizations running the ASE beta. Allowed values are:
     * - **ASE_AUTO**. Akamai automatically updates your rulesets.
     * - **ASE_MANUAL**. Manually updates your rulesets.
     */
    securityPolicyId?: pulumi.Input<string>;
    upgradeMode?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AppSecRuleUpgrade resource.
 */
export interface AppSecRuleUpgradeArgs {
    /**
     * . Unique identifier of the security configuration associated with the ruleset being upgraded.
     */
    configId: pulumi.Input<number>;
    /**
     * . Unique identifier of the security policy associated with the ruleset being upgraded.
     * - `upgradeMode`. (Optional). Modifies the upgrade type for organizations running the ASE beta. Allowed values are:
     * - **ASE_AUTO**. Akamai automatically updates your rulesets.
     * - **ASE_MANUAL**. Manually updates your rulesets.
     */
    securityPolicyId: pulumi.Input<string>;
    upgradeMode?: pulumi.Input<string>;
}