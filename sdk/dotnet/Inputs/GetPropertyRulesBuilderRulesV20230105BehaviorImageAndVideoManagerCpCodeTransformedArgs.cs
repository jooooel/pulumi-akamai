// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformedInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("cpCodeLimits")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimitsInputArgs>? CpCodeLimits { get; set; }

        [Input("createdDate")]
        public Input<int>? CreatedDate { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("id")]
        public Input<int>? Id { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("products")]
        private InputList<string>? _products;
        public InputList<string> Products
        {
            get => _products ?? (_products = new InputList<string>());
            set => _products = value;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformedInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformedInputArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformedInputArgs();
    }
}