// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * **Scopes**: Security policy
 *
 * Enables or disables reputation protection for a security configuration and security policy.
 * Reputation profiles grade the security risk of an IP address based on previous activities associated with that address.
 * Depending on the reputation score and how your configuration has been set up, requests from a specific IP address can trigger an alert or even be blocked.
 *
 * **Related API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/security-policies/{policyId}/protections](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putprotections)
 *
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
 * const protection = new akamai.AppSecReputationProtection("protection", {
 *     configId: configuration.then(configuration => configuration.configId),
 *     securityPolicyId: "gms1_134637",
 *     enabled: true,
 * });
 * ```
 * ## Output Options
 *
 * The following options can be used to determine the information returned, and how that returned information is formatted:
 *
 * - `outputText`. Tabular report showing the current protection settings.
 */
export class AppSecReputationProtection extends pulumi.CustomResource {
    /**
     * Get an existing AppSecReputationProtection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppSecReputationProtectionState, opts?: pulumi.CustomResourceOptions): AppSecReputationProtection {
        return new AppSecReputationProtection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/appSecReputationProtection:AppSecReputationProtection';

    /**
     * Returns true if the given object is an instance of AppSecReputationProtection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppSecReputationProtection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppSecReputationProtection.__pulumiType;
    }

    /**
     * . Unique identifier of the security configuration associated with the reputation protection settings being modified.
     */
    public readonly configId!: pulumi.Output<number>;
    /**
     * . Set to **true** to enable reputation protection; set to **false** to disable reputation protection.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Text Export representation
     */
    public /*out*/ readonly outputText!: pulumi.Output<string>;
    /**
     * . Unique identifier of the security policy associated with the reputation protection settings being modified.
     */
    public readonly securityPolicyId!: pulumi.Output<string>;

    /**
     * Create a AppSecReputationProtection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppSecReputationProtectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppSecReputationProtectionArgs | AppSecReputationProtectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppSecReputationProtectionState | undefined;
            resourceInputs["configId"] = state ? state.configId : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["outputText"] = state ? state.outputText : undefined;
            resourceInputs["securityPolicyId"] = state ? state.securityPolicyId : undefined;
        } else {
            const args = argsOrState as AppSecReputationProtectionArgs | undefined;
            if ((!args || args.configId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configId'");
            }
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.securityPolicyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityPolicyId'");
            }
            resourceInputs["configId"] = args ? args.configId : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["securityPolicyId"] = args ? args.securityPolicyId : undefined;
            resourceInputs["outputText"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AppSecReputationProtection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppSecReputationProtection resources.
 */
export interface AppSecReputationProtectionState {
    /**
     * . Unique identifier of the security configuration associated with the reputation protection settings being modified.
     */
    configId?: pulumi.Input<number>;
    /**
     * . Set to **true** to enable reputation protection; set to **false** to disable reputation protection.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Text Export representation
     */
    outputText?: pulumi.Input<string>;
    /**
     * . Unique identifier of the security policy associated with the reputation protection settings being modified.
     */
    securityPolicyId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AppSecReputationProtection resource.
 */
export interface AppSecReputationProtectionArgs {
    /**
     * . Unique identifier of the security configuration associated with the reputation protection settings being modified.
     */
    configId: pulumi.Input<number>;
    /**
     * . Set to **true** to enable reputation protection; set to **false** to disable reputation protection.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * . Unique identifier of the security policy associated with the reputation protection settings being modified.
     */
    securityPolicyId: pulumi.Input<string>;
}