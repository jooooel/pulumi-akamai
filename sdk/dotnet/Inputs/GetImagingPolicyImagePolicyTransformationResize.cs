// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationResizeArgs : global::Pulumi.InvokeArgs
    {
        [Input("aspect")]
        public string? Aspect { get; set; }

        [Input("aspectVar")]
        public string? AspectVar { get; set; }

        [Input("height")]
        public string? Height { get; set; }

        [Input("heightVar")]
        public string? HeightVar { get; set; }

        [Input("type")]
        public string? Type { get; set; }

        [Input("typeVar")]
        public string? TypeVar { get; set; }

        [Input("width")]
        public string? Width { get; set; }

        [Input("widthVar")]
        public string? WidthVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationResizeArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationResizeArgs Empty => new GetImagingPolicyImagePolicyTransformationResizeArgs();
    }
}
