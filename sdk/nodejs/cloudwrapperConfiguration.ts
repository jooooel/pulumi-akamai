// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class CloudwrapperConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing CloudwrapperConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CloudwrapperConfigurationState, opts?: pulumi.CustomResourceOptions): CloudwrapperConfiguration {
        return new CloudwrapperConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/cloudwrapperConfiguration:CloudwrapperConfiguration';

    /**
     * Returns true if the given object is an instance of CloudwrapperConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CloudwrapperConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CloudwrapperConfiguration.__pulumiType;
    }

    /**
     * Capacity Alerts enablement information for the configuration. The Alert Threshold should be between 50 and 100.
     */
    public readonly capacityAlertsThreshold!: pulumi.Output<number | undefined>;
    /**
     * Additional information you provide to differentiate or track changes of the configuration.
     */
    public readonly comments!: pulumi.Output<string>;
    /**
     * Name of the configuration.
     */
    public readonly configName!: pulumi.Output<string>;
    /**
     * Contract ID having Cloud Wrapper entitlement.
     */
    public readonly contractId!: pulumi.Output<string>;
    /**
     * List of locations to use with the configuration.
     */
    public readonly locations!: pulumi.Output<outputs.CloudwrapperConfigurationLocation[] | undefined>;
    /**
     * Email addresses to use for notifications.
     */
    public readonly notificationEmails!: pulumi.Output<string[]>;
    /**
     * List of properties belonging to eligible products.
     */
    public readonly propertyIds!: pulumi.Output<string[]>;
    /**
     * Retain idle objects beyond their max idle lifetime.
     */
    public readonly retainIdleObjects!: pulumi.Output<boolean>;
    /**
     * Unique hash value of the configuration.
     */
    public /*out*/ readonly revision!: pulumi.Output<string>;
    public readonly timeouts!: pulumi.Output<outputs.CloudwrapperConfigurationTimeouts | undefined>;

    /**
     * Create a CloudwrapperConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CloudwrapperConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CloudwrapperConfigurationArgs | CloudwrapperConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CloudwrapperConfigurationState | undefined;
            resourceInputs["capacityAlertsThreshold"] = state ? state.capacityAlertsThreshold : undefined;
            resourceInputs["comments"] = state ? state.comments : undefined;
            resourceInputs["configName"] = state ? state.configName : undefined;
            resourceInputs["contractId"] = state ? state.contractId : undefined;
            resourceInputs["locations"] = state ? state.locations : undefined;
            resourceInputs["notificationEmails"] = state ? state.notificationEmails : undefined;
            resourceInputs["propertyIds"] = state ? state.propertyIds : undefined;
            resourceInputs["retainIdleObjects"] = state ? state.retainIdleObjects : undefined;
            resourceInputs["revision"] = state ? state.revision : undefined;
            resourceInputs["timeouts"] = state ? state.timeouts : undefined;
        } else {
            const args = argsOrState as CloudwrapperConfigurationArgs | undefined;
            if ((!args || args.comments === undefined) && !opts.urn) {
                throw new Error("Missing required property 'comments'");
            }
            if ((!args || args.configName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configName'");
            }
            if ((!args || args.contractId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'contractId'");
            }
            if ((!args || args.propertyIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'propertyIds'");
            }
            resourceInputs["capacityAlertsThreshold"] = args ? args.capacityAlertsThreshold : undefined;
            resourceInputs["comments"] = args ? args.comments : undefined;
            resourceInputs["configName"] = args ? args.configName : undefined;
            resourceInputs["contractId"] = args ? args.contractId : undefined;
            resourceInputs["locations"] = args ? args.locations : undefined;
            resourceInputs["notificationEmails"] = args ? args.notificationEmails : undefined;
            resourceInputs["propertyIds"] = args ? args.propertyIds : undefined;
            resourceInputs["retainIdleObjects"] = args ? args.retainIdleObjects : undefined;
            resourceInputs["timeouts"] = args ? args.timeouts : undefined;
            resourceInputs["revision"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CloudwrapperConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CloudwrapperConfiguration resources.
 */
export interface CloudwrapperConfigurationState {
    /**
     * Capacity Alerts enablement information for the configuration. The Alert Threshold should be between 50 and 100.
     */
    capacityAlertsThreshold?: pulumi.Input<number>;
    /**
     * Additional information you provide to differentiate or track changes of the configuration.
     */
    comments?: pulumi.Input<string>;
    /**
     * Name of the configuration.
     */
    configName?: pulumi.Input<string>;
    /**
     * Contract ID having Cloud Wrapper entitlement.
     */
    contractId?: pulumi.Input<string>;
    /**
     * List of locations to use with the configuration.
     */
    locations?: pulumi.Input<pulumi.Input<inputs.CloudwrapperConfigurationLocation>[]>;
    /**
     * Email addresses to use for notifications.
     */
    notificationEmails?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of properties belonging to eligible products.
     */
    propertyIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Retain idle objects beyond their max idle lifetime.
     */
    retainIdleObjects?: pulumi.Input<boolean>;
    /**
     * Unique hash value of the configuration.
     */
    revision?: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.CloudwrapperConfigurationTimeouts>;
}

/**
 * The set of arguments for constructing a CloudwrapperConfiguration resource.
 */
export interface CloudwrapperConfigurationArgs {
    /**
     * Capacity Alerts enablement information for the configuration. The Alert Threshold should be between 50 and 100.
     */
    capacityAlertsThreshold?: pulumi.Input<number>;
    /**
     * Additional information you provide to differentiate or track changes of the configuration.
     */
    comments: pulumi.Input<string>;
    /**
     * Name of the configuration.
     */
    configName: pulumi.Input<string>;
    /**
     * Contract ID having Cloud Wrapper entitlement.
     */
    contractId: pulumi.Input<string>;
    /**
     * List of locations to use with the configuration.
     */
    locations?: pulumi.Input<pulumi.Input<inputs.CloudwrapperConfigurationLocation>[]>;
    /**
     * Email addresses to use for notifications.
     */
    notificationEmails?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of properties belonging to eligible products.
     */
    propertyIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Retain idle objects beyond their max idle lifetime.
     */
    retainIdleObjects?: pulumi.Input<boolean>;
    timeouts?: pulumi.Input<inputs.CloudwrapperConfigurationTimeouts>;
}