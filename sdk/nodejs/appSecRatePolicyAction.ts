// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * **Scopes**: Rate policy
 *
 * Creates, modifies or deletes the actions associated with a rate policy.
 * By default, rate policies take no action when triggered.
 * Note that you must set separate actions for requests originating from an IPv4 IP address and for requests originating from an IPv6 address.
 *
 * **Related API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/security-policies/{policyId}/rate-policies/{ratePolicyId}](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putactionsperratepolicy)
 *
 * ## Example Usage
 *
 * Basic usage:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as akamai from "@pulumi/akamai";
 * import * from "fs";
 *
 * const configuration = akamai.getAppSecConfiguration({
 *     name: "Documentation",
 * });
 * const appsecRatePolicy = new akamai.AppSecRatePolicy("appsecRatePolicy", {
 *     configId: configuration.then(configuration => configuration.configId),
 *     ratePolicy: fs.readFileSync(`${path.module}/rate_policy.json`),
 * });
 * const appsecRatePolicyAction = new akamai.AppSecRatePolicyAction("appsecRatePolicyAction", {
 *     configId: configuration.then(configuration => configuration.configId),
 *     securityPolicyId: "gms1_134637",
 *     ratePolicyId: appsecRatePolicy.ratePolicyId,
 *     ipv4Action: "deny",
 *     ipv6Action: "deny",
 * });
 * ```
 */
export class AppSecRatePolicyAction extends pulumi.CustomResource {
    /**
     * Get an existing AppSecRatePolicyAction resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppSecRatePolicyActionState, opts?: pulumi.CustomResourceOptions): AppSecRatePolicyAction {
        return new AppSecRatePolicyAction(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/appSecRatePolicyAction:AppSecRatePolicyAction';

    /**
     * Returns true if the given object is an instance of AppSecRatePolicyAction.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppSecRatePolicyAction {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppSecRatePolicyAction.__pulumiType;
    }

    /**
     * . Unique identifier of the security configuration associated with the rate policy action  being modified.
     */
    public readonly configId!: pulumi.Output<number>;
    /**
     * . Rate policy action for requests coming from an IPv4 IP address. Allowed actions are:
     * - **alert**. Record the event,
     * - **deny**. Block the request.
     * - **deny_custom{custom_deny_id}**. Take the action specified by the custom deny.
     * - **none**. Take no action.
     */
    public readonly ipv4Action!: pulumi.Output<string>;
    /**
     * . Rate policy action for requests coming from an IPv6 IP address. Allowed actions are:
     * - **alert**. Record the event.
     * - **deny**. Block the request.
     * - **deny_custom{custom_deny_id}**. Take the action specified by the custom deny.
     */
    public readonly ipv6Action!: pulumi.Output<string>;
    /**
     * . Unique identifier of the rate policy whose action is being modified.
     */
    public readonly ratePolicyId!: pulumi.Output<number>;
    public readonly securityPolicyId!: pulumi.Output<string>;

    /**
     * Create a AppSecRatePolicyAction resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppSecRatePolicyActionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppSecRatePolicyActionArgs | AppSecRatePolicyActionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppSecRatePolicyActionState | undefined;
            resourceInputs["configId"] = state ? state.configId : undefined;
            resourceInputs["ipv4Action"] = state ? state.ipv4Action : undefined;
            resourceInputs["ipv6Action"] = state ? state.ipv6Action : undefined;
            resourceInputs["ratePolicyId"] = state ? state.ratePolicyId : undefined;
            resourceInputs["securityPolicyId"] = state ? state.securityPolicyId : undefined;
        } else {
            const args = argsOrState as AppSecRatePolicyActionArgs | undefined;
            if ((!args || args.configId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configId'");
            }
            if ((!args || args.ipv4Action === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ipv4Action'");
            }
            if ((!args || args.ipv6Action === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ipv6Action'");
            }
            if ((!args || args.ratePolicyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ratePolicyId'");
            }
            if ((!args || args.securityPolicyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityPolicyId'");
            }
            resourceInputs["configId"] = args ? args.configId : undefined;
            resourceInputs["ipv4Action"] = args ? args.ipv4Action : undefined;
            resourceInputs["ipv6Action"] = args ? args.ipv6Action : undefined;
            resourceInputs["ratePolicyId"] = args ? args.ratePolicyId : undefined;
            resourceInputs["securityPolicyId"] = args ? args.securityPolicyId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AppSecRatePolicyAction.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppSecRatePolicyAction resources.
 */
export interface AppSecRatePolicyActionState {
    /**
     * . Unique identifier of the security configuration associated with the rate policy action  being modified.
     */
    configId?: pulumi.Input<number>;
    /**
     * . Rate policy action for requests coming from an IPv4 IP address. Allowed actions are:
     * - **alert**. Record the event,
     * - **deny**. Block the request.
     * - **deny_custom{custom_deny_id}**. Take the action specified by the custom deny.
     * - **none**. Take no action.
     */
    ipv4Action?: pulumi.Input<string>;
    /**
     * . Rate policy action for requests coming from an IPv6 IP address. Allowed actions are:
     * - **alert**. Record the event.
     * - **deny**. Block the request.
     * - **deny_custom{custom_deny_id}**. Take the action specified by the custom deny.
     */
    ipv6Action?: pulumi.Input<string>;
    /**
     * . Unique identifier of the rate policy whose action is being modified.
     */
    ratePolicyId?: pulumi.Input<number>;
    securityPolicyId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AppSecRatePolicyAction resource.
 */
export interface AppSecRatePolicyActionArgs {
    /**
     * . Unique identifier of the security configuration associated with the rate policy action  being modified.
     */
    configId: pulumi.Input<number>;
    /**
     * . Rate policy action for requests coming from an IPv4 IP address. Allowed actions are:
     * - **alert**. Record the event,
     * - **deny**. Block the request.
     * - **deny_custom{custom_deny_id}**. Take the action specified by the custom deny.
     * - **none**. Take no action.
     */
    ipv4Action: pulumi.Input<string>;
    /**
     * . Rate policy action for requests coming from an IPv6 IP address. Allowed actions are:
     * - **alert**. Record the event.
     * - **deny**. Block the request.
     * - **deny_custom{custom_deny_id}**. Take the action specified by the custom deny.
     */
    ipv6Action: pulumi.Input<string>;
    /**
     * . Unique identifier of the rate policy whose action is being modified.
     */
    ratePolicyId: pulumi.Input<number>;
    securityPolicyId: pulumi.Input<string>;
}