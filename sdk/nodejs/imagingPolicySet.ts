// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class ImagingPolicySet extends pulumi.CustomResource {
    /**
     * Get an existing ImagingPolicySet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ImagingPolicySetState, opts?: pulumi.CustomResourceOptions): ImagingPolicySet {
        return new ImagingPolicySet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'akamai:index/imagingPolicySet:ImagingPolicySet';

    /**
     * Returns true if the given object is an instance of ImagingPolicySet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ImagingPolicySet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ImagingPolicySet.__pulumiType;
    }

    /**
     * The unique identifier for the Akamai Contract containing the Policy Set(s)
     */
    public readonly contractId!: pulumi.Output<string>;
    /**
     * A friendly name for the Policy Set
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The geographic region which media using this Policy Set is optimized for
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The type of media this Policy Set manages
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a ImagingPolicySet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ImagingPolicySetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ImagingPolicySetArgs | ImagingPolicySetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ImagingPolicySetState | undefined;
            resourceInputs["contractId"] = state ? state.contractId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as ImagingPolicySetArgs | undefined;
            if ((!args || args.contractId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'contractId'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["contractId"] = args ? args.contractId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ImagingPolicySet.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ImagingPolicySet resources.
 */
export interface ImagingPolicySetState {
    /**
     * The unique identifier for the Akamai Contract containing the Policy Set(s)
     */
    contractId?: pulumi.Input<string>;
    /**
     * A friendly name for the Policy Set
     */
    name?: pulumi.Input<string>;
    /**
     * The geographic region which media using this Policy Set is optimized for
     */
    region?: pulumi.Input<string>;
    /**
     * The type of media this Policy Set manages
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ImagingPolicySet resource.
 */
export interface ImagingPolicySetArgs {
    /**
     * The unique identifier for the Akamai Contract containing the Policy Set(s)
     */
    contractId: pulumi.Input<string>;
    /**
     * A friendly name for the Policy Set
     */
    name?: pulumi.Input<string>;
    /**
     * The geographic region which media using this Policy Set is optimized for
     */
    region: pulumi.Input<string>;
    /**
     * The type of media this Policy Set manages
     */
    type: pulumi.Input<string>;
}